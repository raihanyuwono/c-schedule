package com.tugas.raihan.c_schedule;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SignUpActivity extends AppCompatActivity {

    private EditText inputEmail;
    private EditText inputPassword;
    private EditText inputConfirmPassword;
    private Button btnSignUp;

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
                Intent intent = new Intent(SignUpActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    private void initItems() {
        inputEmail = findViewById(R.id.input_sign_up_email);
        inputPassword = findViewById(R.id.input_sign_up_password);
        inputConfirmPassword = findViewById(R.id.input_sign_up_confirm_password);
        btnSignUp = findViewById(R.id.sign_up);
    }
}
