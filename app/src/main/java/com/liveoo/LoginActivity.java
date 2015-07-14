package com.liveoo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.liveooapp.liveoo.R;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void login(View view) {
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }

    public void register(View view) {
        startActivity(new Intent(this, RegisterActivity.class));
    }

    public void restorePassword(View view) {
        startActivity(new Intent(this, PasswordRestoreActivity.class));
    }
}
