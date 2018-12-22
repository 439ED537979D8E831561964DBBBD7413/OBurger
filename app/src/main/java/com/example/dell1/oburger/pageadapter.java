package com.example.dell1.oburger;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class pageadapter extends FragmentStatePagerAdapter {
    public int tabs;
    public pageadapter(FragmentManager fragementmananger, int tabs)
    {
        super(fragementmananger);
        this.tabs = tabs;
    }
    @Override
    public Fragment getItem(int i) {
        switch (i) {
            case 0:
            BeefTap beefTap = new BeefTap();
            return beefTap;
            case 1:
                ChickenTap chickenTap= new ChickenTap();
                return chickenTap;
            case 2:
            FishTap fishTap= new FishTap();
            return fishTap;
            case 3:
                BundleTap bundleTap= new BundleTap();
                return bundleTap;
            case 4:
                DessertTap dessertTap = new DessertTap();
                return dessertTap;
            case 5:
                BeveragesTap beveragesTap= new BeveragesTap();
                return beveragesTap;
            default:
                break;
        }
        return null;
    }
    @Override
    public int getCount() {
        return tabs;
    }
}
