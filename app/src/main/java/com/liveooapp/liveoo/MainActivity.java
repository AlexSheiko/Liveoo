package com.liveooapp.liveoo;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openCategory(View view) {
        FrameLayout container = (FrameLayout) view;
        TextView categoryView = (TextView) container.getChildAt(container.getChildCount()-1);
        String category = categoryView.getText().toString();
        // TODO Open only selected category
        SharedPreferences sharedPrefs =
                PreferenceManager.getDefaultSharedPreferences(this);
        sharedPrefs.edit().putString("category", category).apply();
        startActivity(new Intent(this, EventListActivity.class));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_settings:
                startActivity(new Intent(this, SettingsActivity.class));
                return true;
            case R.id.action_tickets:
                startActivity(new Intent(this, TicketListActivity.class));
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
