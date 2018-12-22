package com.example.dell1.oburger;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.Fragemnts);

        tabLayout.addTab(tabLayout.newTab().setText(getString(R.string.Beef)));
        tabLayout.addTab(tabLayout.newTab().setText(getString(R.string.Chicken)));
        tabLayout.addTab(tabLayout.newTab().setText(getString(R.string.Fish)));
        tabLayout.addTab(tabLayout.newTab().setText(getString(R.string.Bundle)));
        tabLayout.addTab(tabLayout.newTab().setText(getString(R.string.Desserts)));
        tabLayout.addTab(tabLayout.newTab().setText(getString(R.string.Beverages)));
        final ViewPager viewPager = (ViewPager) findViewById(R.id.pager);
        final pageadapter adapter = new pageadapter(getSupportFragmentManager(),
                tabLayout.getTabCount());

        viewPager.setAdapter(adapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener()
        {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }
            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
            }
        });
    }
}
