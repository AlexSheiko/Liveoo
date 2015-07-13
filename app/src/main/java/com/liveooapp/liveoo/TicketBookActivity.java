package com.liveooapp.liveoo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

public class TicketBookActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ticket_book);

        // set height to a card
        FrameLayout containerView = (FrameLayout) findViewById(R.id.container);
        int screenWidth = getResources().getDisplayMetrics().widthPixels;
        containerView.setLayoutParams(new LinearLayout.LayoutParams(screenWidth, (int) (screenWidth * 0.55)));
        // set paddings
        int paddingX = getResources().getDimensionPixelSize(R.dimen.activity_horizontal_margin);
        int paddingY = getResources().getDimensionPixelSize(R.dimen.activity_vertical_margin);
        containerView.setPadding(paddingX, 0, paddingX, paddingY);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_share, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.action_share) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void bookTicket(View view) {
        startActivity(new Intent(this, TicketPayActivity.class));
    }
}
