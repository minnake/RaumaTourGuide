package com.example.keinonen.raumatourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TabAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public TabAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }


    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new RaumaFragment();
        } else if (position == 1) {
            return new SitesFragment();
        } else if (position == 2) {
            return new EventsFragment();
        } else if (position == 3) {
            return new HotelsFragment();
        } else {
            return new WeblinksFragment();
        }
    }

    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.tab_rauma);
        } else if (position == 1) {
            return mContext.getString(R.string.tab_sites);
        } else if (position == 2) {
            return mContext.getString(R.string.tab_events);
        } else if (position == 3) {
            return mContext.getString(R.string.tab_hotels);
        } else {
            return mContext.getString(R.string.tab_links);
        }
    }
}
