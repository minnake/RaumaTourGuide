package com.example.keinonen.raumatourguide;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class SitesFragment extends Fragment {


    public SitesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_layout, container, false);

        final ArrayList<Guide> guides = new ArrayList<Guide>();
        guides.add(new Guide(R.string.unesco1_header, R.string.unesco1_text, R.drawable.vanha_rauma));
        guides.add(new Guide(R.string.unesco2_header, R.string.unesco2_text, R.drawable.sammallahdenmaki));
        guides.add(new Guide(R.string.raatihuone_header, R.string.raatihuone_text, R.drawable.raatihuone));

        GuideAdapter adapter = new GuideAdapter(getActivity(), guides);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}