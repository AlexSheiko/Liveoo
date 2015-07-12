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
        containerView.setLayoutParams(new AbsListView.LayoutParams(screenWidth, (int) (screenWidth * 0.8)));
        int padding = convertToPixels(4);
        containerView.setPadding(padding, 0, padding, padding);

        ((TextView) rootView.findViewById(R.id.title)).setText(event.getTitle());
        ((TextView) rootView.findViewById(R.id.category)).setText(event.getCategory());
        ((TextView) rootView.findViewById(R.id.datetime)).setText(event.getDateTime());
        ((TextView) rootView.findViewById(R.id.location)).setText(event.getLocation());
        ((TextView) rootView.findViewById(R.id.price)).setText(event.getPrice());

        return rootView;
    }

    public int convertToPixels(int dp) {
        float density = getContext().getResources().getDisplayMetrics().density;
        return (int) (dp * density);
    }
}
