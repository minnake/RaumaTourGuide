package com.example.keinonen.raumatourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class EventsFragment extends Fragment {


    public EventsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_layout, container, false);

        final ArrayList<Guide> guides = new ArrayList<Guide>();
        guides.add(new Guide(R.string.rmj_header, R.string.rmj_text));
        guides.add(new Guide(R.string.lace_header, R.string.lace_text));

        GuideAdapter adapter = new GuideAdapter(getActivity(), guides);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}

