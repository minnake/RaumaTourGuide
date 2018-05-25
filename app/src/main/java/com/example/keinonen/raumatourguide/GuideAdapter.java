package com.example.keinonen.raumatourguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class GuideAdapter extends ArrayAdapter<Guide> {

    public GuideAdapter(Context context, ArrayList<Guide> guides) {
        super(context, 0, guides);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Guide listGuides = getItem(position);

        TextView headerTextView = (TextView) listItemView.findViewById(R.id.header_text_view);
        headerTextView.setText(listGuides.getHeaderName());

        TextView infoTextView = (TextView) listItemView.findViewById(R.id.info_text_view);
        infoTextView.setText(listGuides.getInfoText());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        if (listGuides.hasImage()) {
            imageView.setImageResource(listGuides.getImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }

        return listItemView;
    }
}