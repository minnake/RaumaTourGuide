package com.example.keinonen.raumatourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class HotelsFragment extends Fragment {


    public HotelsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_layout, container, false);

        final ArrayList<Guide> guides = new ArrayList<Guide>();
        guides.add(new Guide(R.string.kalliohovi_header, R.string.kalliohovi_text, R.drawable.hotel01));
        guides.add(new Guide(R.string.placeToSleep_header, R.string.placeToSleep_text, R.drawable.hotel02));
        guides.add(new Guide(R.string.raumanlinna_header, R.string.raumanlinna_text, R.drawable.hotel03));

        GuideAdapter adapter = new GuideAdapter(getActivity(), guides);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
