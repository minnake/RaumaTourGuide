package com.example.keinonen.raumatourguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class LinkAdapter extends ArrayAdapter<Link> {

    public LinkAdapter(Context context, ArrayList<Link> links) {
        super(context, 0, links);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.link_list, parent, false);
        }

        Link listOfLinks = getItem(position);

        TextView linkTextView = (TextView) listItemView.findViewById(R.id.link_text_view);
        linkTextView.setText(listOfLinks.getWebLink());

        return listItemView;
    }
}
