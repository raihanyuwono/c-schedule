package com.tugas.raihan.c_schedule;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplachScreen extends AppCompatActivity {

    private final int SPLASH_DISPLAY_LENGTH = 2500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splach_screen);
        getSupportActionBar().hide();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startSplash();
            }
        }, SPLASH_DISPLAY_LENGTH);

    }

    private void startSplash() {
        startActivity(new Intent(this, LoginActivity.class));
        finish();
    }

}
