package com.tugas.raihan.c_schedule;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import static com.tugas.raihan.c_schedule.StaticVariable.firebaseAuth;

public class SignUpActivity extends AppCompatActivity {

    FirebaseUser user;

    private EditText inputEmail;
    private EditText inputPassword;
    private EditText inputConfirmPassword;
    private Button btnSignUp;

    private String email;
    private String password;
    private String confirmPassword;
    private ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        initItems();
        initListener();
    }

    private void initListener() {
        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                signup();
            }
        });
    }

    private void signup() {
        progressDialog.show();

        email = inputEmail.getText().toString();
        password = inputPassword.getText().toString();
        confirmPassword = inputConfirmPassword.getText().toString();

        if (checkRequired()) {
            firebaseAuth.createUserWithEmailAndPassword(email, password)
                    .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            progressDialog.dismiss();
                            if (task.isSuccessful()) {
                                user = firebaseAuth.getCurrentUser();
                                startActivity(new Intent(SignUpActivity.this, MainActivity.class));
                                finish();
                            } else {
                                Toast.makeText(SignUpActivity.this, "Try Again", Toast.LENGTH_LONG).show();
                            }
                        }
                    });
        } else {
            Toast.makeText(SignUpActivity.this, "email and password are required", Toast.LENGTH_LONG).show();
        }

    }

    private boolean checkRequired() {
        return !(email.equals("") || password.equals("") || confirmPassword.equals(""));
    }

    private void initItems() {
        getSupportActionBar().hide();

        inputEmail = findViewById(R.id.input_sign_up_email);
        inputPassword = findViewById(R.id.input_sign_up_password);
        inputConfirmPassword = findViewById(R.id.input_sign_up_confirm_password);
        btnSignUp = findViewById(R.id.sign_up);

        progressDialog = new ProgressDialog(this);
        progressDialog.setMessage("Please Wait");
    }
}
