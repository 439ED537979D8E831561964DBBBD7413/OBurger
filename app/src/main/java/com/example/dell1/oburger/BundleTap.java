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

public class BundleTap extends android.support.v4.app.Fragment {
    ArrayList<MacFood> ItemsOfFragment = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_bundle_tap,
                container, false);

        AddingToList3();

        ListView listView = (ListView) view.findViewById(R.id.bundleFragment);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        Intent a = new Intent(getContext(), BundleDetails.class);
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

    public void AddingToList3() {

        ItemsOfFragment.add(new MacFood(
                getString(R.string.Bundle1),
                getString(R.string.Bundle2),
                R.drawable.bundle2));


        ItemsOfFragment.add(new MacFood(
                getString(R.string.Bundle3),
                getString(R.string.Bundle4),
                R.drawable.bundle1));


        ItemsOfFragment.add(new MacFood(
                getString(R.string.Bundle5),
                getString(R.string.Bundle6),
                R.drawable.bundle3));


        ItemsOfFragment.add(new MacFood(
                getString(R.string.Bundle7),
                getString(R.string.Bundle8),
                R.drawable.bundle4));
        ItemsOfFragment.add(new MacFood(
                getString(R.string.Bundle9),
                getString(R.string.Bundle10),
                R.drawable.bundle5));


        ItemsOfFragment.add(new MacFood(
                getString(R.string.Bundle1),
                getString(R.string.Bundle6),
                R.drawable.bundle6));
        ItemsOfFragment.add(new MacFood(
                getString(R.string.Bundle3),
                getString(R.string.Bundle10),
                R.drawable.bundle7));


        ItemsOfFragment.add(new MacFood(
                getString(R.string.Bundle5),
                getString(R.string.Bundle2),
                R.drawable.bundle8));
    }
}
