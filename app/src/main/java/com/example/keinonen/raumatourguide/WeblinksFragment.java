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
public class WeblinksFragment extends Fragment {


    public WeblinksFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_info, container, false);

        final ArrayList<Link> links = new ArrayList<Link>();
        links.add(new Link(R.string.visit_rauma_link));
        links.add(new Link(R.string.rauma_wikipedia_link));

        links.add(new Link(R.string.rmj_link));
        links.add(new Link(R.string.lace_week_link));

        links.add(new Link(R.string.kalliohovi_link));
        links.add(new Link(R.string.placeToSleep_link));
        links.add(new Link(R.string.raumanlinna_link));
        links.add(new Link(R.string.accommodation_link));

        LinkAdapter adapter = new LinkAdapter(getActivity(), links);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
