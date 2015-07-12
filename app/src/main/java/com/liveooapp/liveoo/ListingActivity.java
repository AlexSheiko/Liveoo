package com.liveooapp.liveoo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ListingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listing);

        String category = getIntent().getStringExtra("category");
        getSupportActionBar().setTitle(category);

        List<Event> eventList = new ArrayList<>();
        eventList.add(new Event());
        eventList.add(new Event());
        eventList.add(new Event());

        ListView listView = (ListView) findViewById(android.R.id.list);
        listView.setAdapter(new ListingAdapter(this, eventList));
    }
}
