package com.liveoo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.liveooapp.liveoo.R;

public class TicketPayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ticket_pay);
    }

    public void makePayment(View view) {
        startActivity(new Intent(this, TicketResultActivity.class));
    }
}
