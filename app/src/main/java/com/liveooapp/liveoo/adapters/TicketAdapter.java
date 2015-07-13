package com.liveooapp.liveoo.adapters;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.liveooapp.liveoo.R;

import java.util.List;

public class TicketAdapter extends ArrayAdapter<Ticket> {

    public TicketAdapter(Context context, List<Ticket> ticketList) {
        super(context, 0, ticketList);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View rootView;
        if (convertView != null) {
            rootView = convertView;
        } else {
            LayoutInflater inflater = ((Activity) getContext()).getLayoutInflater();
            rootView = inflater.inflate(R.layout.ticket_list_item, null);
        }

        Ticket ticket = getItem(position);

        ((TextView) rootView.findViewById(R.id.title)).setText(ticket.getTitle());
        ((TextView) rootView.findViewById(R.id.address)).setText(ticket.getAddress());
        ((TextView) rootView.findViewById(R.id.datetime)).setText(ticket.getDateTime());
        ((TextView) rootView.findViewById(R.id.location)).setText(ticket.getLocation());

        if (position == 1) {
            ((ImageView) rootView.findViewById(R.id.icon)).setImageDrawable(
                    getContext().getResources().getDrawable(R.drawable.ic_ticket_2));
        } else if (position == 2) {
            ((ImageView) rootView.findViewById(R.id.icon)).setImageDrawable(
                    getContext().getResources().getDrawable(R.drawable.ic_ticket_3));
        }

        return rootView;
    }
}
