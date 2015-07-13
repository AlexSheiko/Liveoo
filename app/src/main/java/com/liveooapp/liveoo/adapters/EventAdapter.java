package com.liveooapp.liveoo.adapters;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;

import com.liveooapp.liveoo.R;

import java.util.List;

public class EventAdapter extends ArrayAdapter<Event> {

    public EventAdapter(Context context, List<Event> eventList) {
        super(context, 0, eventList);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View rootView;
        if (convertView != null) {
            rootView = convertView;
        } else {
            LayoutInflater inflater = ((Activity) getContext()).getLayoutInflater();
            rootView = inflater.inflate(R.layout.event_list_item, null);
        }

        Event event = getItem(position);

        // set height to a card
        FrameLayout containerView = (FrameLayout) rootView.findViewById(R.id.container);
        int screenWidth = getContext().getResources().getDisplayMetrics().widthPixels;
        containerView.setLayoutParams(new AbsListView.LayoutParams(screenWidth, (int) (screenWidth * 0.8)));
        // set paddings
        int paddingX = getContext().getResources().getDimensionPixelSize(R.dimen.activity_horizontal_margin);
        int paddingY = getContext().getResources().getDimensionPixelSize(R.dimen.activity_vertical_margin);
        containerView.setPadding(paddingX, 0, paddingX, paddingY);

        if (event.getId() == 1) {
            ((ImageView) rootView.findViewById(R.id.icon)).setImageDrawable(
                    getContext().getResources().getDrawable(R.drawable.ic_event_1));
        } else if (event.getId() == 2) {
            ((ImageView) rootView.findViewById(R.id.icon)).setImageDrawable(
                    getContext().getResources().getDrawable(R.drawable.ic_event_2));
        } else if (event.getId() == 3) {
            ((ImageView) rootView.findViewById(R.id.icon)).setImageDrawable(
                    getContext().getResources().getDrawable(R.drawable.ic_event_3));
        }

        /*
        ((TextView) rootView.findViewById(R.id.title)).setText(event.getTitle());
        ((TextView) rootView.findViewById(R.id.category)).setText(event.getCategory());
        ((TextView) rootView.findViewById(R.id.datetime)).setText(event.getDateTime());
        ((TextView) rootView.findViewById(R.id.location)).setText(event.getLocation());
        ((TextView) rootView.findViewById(R.id.price)).setText(event.getPrice());
        */

        return rootView;
    }
}
