package com.tugas.raihan.c_schedule;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;

import com.google.firebase.auth.FirebaseAuth;

import static com.tugas.raihan.c_schedule.StaticVariable.firebaseAuth;
import static com.tugas.raihan.c_schedule.StaticVariable.user;

public class SplachScreen extends AppCompatActivity {

    private final int SPLASH_DISPLAY_LENGTH = 3500;
    private final int LOGO_SPLASH_DURATION = 2000;

    private View logo;
    private View app_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splach_screen);
        getSupportActionBar().hide();

        initItems();
        showItems();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startSplash();
            }
        }, SPLASH_DISPLAY_LENGTH);

    }

    private void showItems() {
        animateLogo();
        animateAppName();
    }

    private void animateLogo() {
        logo.animate().alpha(1f).setDuration(LOGO_SPLASH_DURATION);
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        showItems();
    }

    private void animateAppName() {
        app_name.animate().alpha(1f).setDuration(LOGO_SPLASH_DURATION);
    }

    private void initItems() {
        logo = findViewById(R.id.logo);
        app_name = findViewById(R.id.app_name);

        firebaseAuth = FirebaseAuth.getInstance();
        user = firebaseAuth.getInstance().getCurrentUser();
    }

    private void startSplash() {
        Intent intent = new Intent(this, LoginActivity.class);
        ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(this,
                new Pair<View, String>(logo, getString(R.string.trans_logo)),
                new Pair<View, String>(app_name, getString(R.string.trans_app_name)));
        startActivity(intent, options.toBundle());
        finish();
    }

}
