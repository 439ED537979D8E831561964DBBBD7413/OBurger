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


public class ChickenTap extends android.support.v4.app.Fragment {
    ArrayList<MacFood> ItemsOfFragment = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_chicken_tap,
                container, false);

        AddingToList4();

        ListView listView = (ListView) view.findViewById(R.id.chickenTap);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        Intent a = new Intent(getContext(), ChickenDetails.class);
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

    public void AddingToList4() {


        ItemsOfFragment.add(new MacFood(
                getString(R.string.Chicken1),
                getString(R.string.Chicken2),
                R.drawable.chicken1));

        ItemsOfFragment.add(new MacFood(
                getString(R.string.Chicken3),
                getString(R.string.Chicken4),
                R.drawable.chicken2));

        ItemsOfFragment.add(new MacFood(
                getString(R.string.Chicken5),
                getString(R.string.Chicken6),
                R.drawable.chicken3));

        ItemsOfFragment.add(new MacFood(
                getString(R.string.Chicken7),
                getString(R.string.Chicken8),
                R.drawable.chicken4));

        ItemsOfFragment.add(new MacFood(
                getString(R.string.Chicken1),
                getString(R.string.Chicken4),
                R.drawable.chicken5));

        ItemsOfFragment.add(new MacFood(
                getString(R.string.Chicken3),
                getString(R.string.Chicken2),
                R.drawable.chicken6));


        ItemsOfFragment.add(new MacFood(
                getString(R.string.Chicken1),
                getString(R.string.Chicken6),
                R.drawable.chicken7));
    }
}
