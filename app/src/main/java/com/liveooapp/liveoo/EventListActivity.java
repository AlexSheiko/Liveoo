package com.liveooapp.liveoo;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.liveooapp.liveoo.adapters.Event;
import com.liveooapp.liveoo.adapters.EventAdapter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EventListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_list);

        SharedPreferences sharedPrefs = PreferenceManager.getDefaultSharedPreferences(this);
        String category = sharedPrefs.getString("category", null);
        getSupportActionBar().setTitle(category);

        List<Event> eventList = new ArrayList<>();
        eventList.add(new Event(1));
        eventList.add(new Event(2));
        eventList.add(new Event(3));
        eventList.add(new Event(1));
        eventList.add(new Event(2));
        eventList.add(new Event(3));
        Collections.shuffle(eventList);

        ListView listView = (ListView) findViewById(android.R.id.list);
        listView.setAdapter(new EventAdapter(this, eventList));
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // TODO: Show details only for selected event
                startActivity(new Intent(EventListActivity.this, EventDetailActivity.class));
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_event_list, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.action_map) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
