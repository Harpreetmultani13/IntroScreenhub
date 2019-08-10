package com.sutra.news.application;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter {

    int mNoOftabs;
    public PagerAdapter(FragmentManager fm, int NumberOfTabs) {
        super(fm);
        this.mNoOftabs= NumberOfTabs;
    }

    @Override
    public Fragment getItem(int i) {

        switch(i)
        {
            case 0 :
                Featured tab1 = new Featured();
                return tab1;
            case 1 :
                National tab2 = new National();
                return tab2;
            case 2 :
                International tab3 = new International();
                return tab3;
            case 3 :
                Sports tab4 = new Sports();
                return tab4;
            case 4 :
                Entertainment tab5 = new Entertainment();
                return tab5;
            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return mNoOftabs;
    }
}
