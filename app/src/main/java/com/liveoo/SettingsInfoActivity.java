package com.liveoo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.liveooapp.liveoo.R;

public class SettingsInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings_info);
    }

    public void update(View view) {
        super.onBackPressed();
    }
}
