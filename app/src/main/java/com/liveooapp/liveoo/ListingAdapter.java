package com.liveooapp.liveoo;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class ListingAdapter extends ArrayAdapter<Event> {

    public ListingAdapter(Context context, List<Event> eventList) {
        super(context, 0, eventList);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View rootView;
        if (convertView != null) {
            rootView = convertView;
        } else {
            LayoutInflater inflater = ((Activity) getContext()).getLayoutInflater();
            rootView = inflater.inflate(R.layout.listing_item, null);
        }

        Event event = getItem(position);

        ViewGroup containerView = (ViewGroup) rootView.findViewById(R.id.container);
        int screenWidth = getContext().getResources().getDisplayMetrics().widthPixels;
        containerView.setLayoutParams(new AbsListView.LayoutParams(screenWidth, (int) (screenWidth * 0.7)));

        ((TextView) rootView.findViewById(R.id.title)).setText(event.getTitle());

        return rootView;
    }
}
