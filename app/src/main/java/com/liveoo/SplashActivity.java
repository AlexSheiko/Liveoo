package com.liveoo;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;

import com.liveooapp.liveoo.R;

public class SplashActivity extends AppCompatActivity {

    private static final int SPLASH_DISPLAY_TIME = 500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            public void run() {
                SharedPreferences sharedPrefs =
                        PreferenceManager.getDefaultSharedPreferences(SplashActivity.this);
//                if (sharedPrefs.getBoolean("registered", false)) {
//                    startActivity(new Intent(SplashActivity.this, MainActivity.class));
//                } else {
                    startActivity(new Intent(SplashActivity.this, LoginActivity.class));
//                }
                SplashActivity.this.finish();

                overridePendingTransition(android.R.anim.fade_in,
                        android.R.anim.fade_out);
            }
        }, SPLASH_DISPLAY_TIME);
    }
}