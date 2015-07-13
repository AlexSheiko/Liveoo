package com.liveooapp.liveoo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.liveooapp.liveoo.adapters.Ticket;
import com.liveooapp.liveoo.adapters.TicketAdapter;

import java.util.ArrayList;
import java.util.List;

public class TicketListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ticket_list);

        List<Ticket> ticketList = new ArrayList<>();
        ticketList.add(new Ticket());
        ticketList.add(new Ticket());
        ticketList.add(new Ticket());

        ListView listView = (ListView) findViewById(android.R.id.list);
        listView.setAdapter(new TicketAdapter(this, ticketList));
         listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
             @Override
             public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                 startActivity(new Intent(TicketListActivity.this, TicketDetailActivity.class));
             }
         });
    }
}
