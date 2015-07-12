package com.liveooapp.liveoo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
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
        Intent intent = new Intent(this, EventListActivity.class);
        intent.putExtra("category", category);
        startActivity(intent);
    }
}
