package com.inhatc.busonda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends AppCompatActivity {

    Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        //2초 후에 다음 액티비티로 전환
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent homeIntent = new Intent(getApplicationContext(), HomeActivity.class);
                startActivity(homeIntent);
                finish();
            }
        }, 2000);
    }
}