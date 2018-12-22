package com.example.dell1.oburger;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class BeveragesTap extends android.support.v4.app.Fragment {
    ArrayList<MacFood> ItemsOfFragment = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_beverages_tap,
                container,
                false);

        AddingToList2();

        ListView listView = (ListView) view.findViewById(R.id.beverageFragment);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        Intent a = new Intent(getContext(), BeveragesDetails.class);
                        startActivity(a);
                        break;
                    default:
                        Toast.makeText(getActivity(), "Wait next Version", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });
        Adapter adapterClass = new Adapter(getContext(), ItemsOfFragment);
        listView.setAdapter(adapterClass);
        return view;
    }

    public void AddingToList2() {

        ItemsOfFragment.add(new MacFood(
                getString(R.string.bev1),
                getString(R.string.bev2),
                R.drawable.beev1));

        ItemsOfFragment.add(new MacFood(
                getString(R.string.bev3),
                getString(R.string.bev4),
                R.drawable.beev2));

        ItemsOfFragment.add(new MacFood(
                getString(R.string.bev5),
                getString(R.string.bev6),
                R.drawable.beev3));


        ItemsOfFragment.add(new MacFood(
                getString(R.string.bev7),
                getString(R.string.bev8),
                R.drawable.beev4));


        ItemsOfFragment.add(new MacFood(
                getString(R.string.bev9),
                getString(R.string.bev6),
                R.drawable.beev5));

        ItemsOfFragment.add(new MacFood(
                getString(R.string.bev10),
                getString(R.string.bev4),
                R.drawable.beev6));

        ItemsOfFragment.add(new MacFood(
                getString(R.string.bev11),
                getString(R.string.bev6),
                R.drawable.beev7));
    }
}