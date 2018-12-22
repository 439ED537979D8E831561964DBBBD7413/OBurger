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

public class FishTap extends android.support.v4.app.Fragment {
    ArrayList<MacFood> ItemsOfFragment = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_fish_tap,
                container, false);

        AddingToList1();

        ListView listView = (ListView) view.findViewById(R.id.beefFragment);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        Intent a = new Intent(getContext(), FishDetails.class);
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

    public void AddingToList1() {

        ItemsOfFragment.add(new MacFood(
                getString(R.string.fish1),
                getString(R.string.fish2),
                R.drawable.fish1));
        ItemsOfFragment.add(new MacFood(
                getString(R.string.fish3),
                getString(R.string.fish4),
                R.drawable.fish2));
        ItemsOfFragment.add(new MacFood(
                getString(R.string.fish5),
                getString(R.string.fish6),
                R.drawable.fish3));
        ItemsOfFragment.add(new MacFood(
                getString(R.string.fish7),
                getString(R.string.fish8),
                R.drawable.fish4));
        ItemsOfFragment.add(new MacFood(
                getString(R.string.fish1),
                getString(R.string.fish4),
                R.drawable.fish5));
        ItemsOfFragment.add(new MacFood(
                getString(R.string.fish5),
                getString(R.string.fish8),
                R.drawable.fish6));
        ItemsOfFragment.add(new MacFood(
                getString(R.string.fish3),
                getString(R.string.fish6),
                R.drawable.fish7));
    }
}
