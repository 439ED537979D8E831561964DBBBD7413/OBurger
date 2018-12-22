package com.example.dell1.oburger;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class BeefTap extends android.support.v4.app.Fragment {
    ArrayList<MacFood> ItemsOfFragment = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_beef_tap,
                container, false);

        AddingToList1();

        ListView listView = (ListView) view.findViewById(R.id.beefFragment);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        Intent a = new Intent(getContext(),
                                BeefDetails.class);
                        startActivity(a);
                }
            }
        });
        Adapter adapterClass = new Adapter(getContext(), ItemsOfFragment);
        listView.setAdapter(adapterClass);
        return view;
    }

    public void AddingToList1() {

        ItemsOfFragment.add(new MacFood(
                getString(R.string.BeefText1),
                getString(R.string.BeefText2),
                R.drawable.beef1));

        ItemsOfFragment.add(new MacFood(
                getString(R.string.BeefText3),
                getString(R.string.BeefText4),
                R.drawable.beef2));


        ItemsOfFragment.add(new MacFood(
                getString(R.string.BeefText5),
                getString(R.string.BeefText6),
                R.drawable.beef3));

        ItemsOfFragment.add(new MacFood(
                getString(R.string.BeefText7),
                getString(R.string.BeefText8),
                R.drawable.beef4));

        ItemsOfFragment.add(new MacFood(
                getString(R.string.BeefText3),
                getString(R.string.BeefText4),
                R.drawable.beef5));

        ItemsOfFragment.add(new MacFood(
                getString(R.string.BeefText1),
                getString(R.string.BeefText2),
                R.drawable.beef6));


        ItemsOfFragment.add(new MacFood(
                getString(R.string.BeefText7),
                getString(R.string.BeefText8),
                R.drawable.beef7));


        ItemsOfFragment.add(new MacFood(
                getString(R.string.BeefText3),
                getString(R.string.BeefText6),
                R.drawable.beef8));


        ItemsOfFragment.add(new MacFood(
                getString(R.string.BeefText1),
                getString(R.string.BeefText8),
                R.drawable.beef9));

    }
}
