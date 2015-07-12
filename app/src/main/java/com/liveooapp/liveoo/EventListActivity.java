package com.liveooapp.liveoo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.liveooapp.liveoo.adapters.Event;
import com.liveooapp.liveoo.adapters.EventAdapter;

import java.util.ArrayList;
import java.util.List;

public class EventListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_list);

        String category = getIntent().getStringExtra("category");
        getSupportActionBar().setTitle(category);

        List<Event> eventList = new ArrayList<>();
        eventList.add(new Event());
        eventList.add(new Event());
        eventList.add(new Event());

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
}
