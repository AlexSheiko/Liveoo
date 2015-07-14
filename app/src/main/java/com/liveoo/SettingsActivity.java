package com.liveoo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.liveooapp.liveoo.R;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
    }

    public void logOut(View view) {
        startActivity(new Intent(this, LoginActivity.class));
    }

    public void manageTags(View view) {
        startActivity(new Intent(this, TagsManageActivity.class));
    }
}
