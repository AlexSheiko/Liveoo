package com.liveoo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import com.liveooapp.liveoo.R;

public class FriendsInviteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friends_invite);

        getSupportActionBar().setTitle("Invite : Steak, Chips & Cocktail");

        // set height to a card
        FrameLayout containerView = (FrameLayout) findViewById(R.id.container);
        int screenWidth = getResources().getDisplayMetrics().widthPixels;
        containerView.setLayoutParams(new LinearLayout.LayoutParams(screenWidth, (int) (screenWidth * 0.55)));
        // set paddings
        int paddingX = getResources().getDimensionPixelSize(R.dimen.activity_horizontal_margin);
        int paddingY = getResources().getDimensionPixelSize(R.dimen.activity_vertical_margin);
        containerView.setPadding(paddingX, 0, paddingX, paddingY);
    }
}
