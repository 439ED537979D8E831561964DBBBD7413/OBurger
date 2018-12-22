package com.example.dell1.oburger;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;


public class DessertTap extends android.support.v4.app.Fragment {
    ArrayList<MacFood> Itemsofegypt = new ArrayList<>();

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_dessert_tap, container, false);

        AddingToList5();

        ListView listView = (ListView) view.findViewById(R.id.dessertFragment);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        Intent a = new Intent(getContext(), DessertDetails.class);
                        startActivity(a);
                        break;
                    default:
                        Toast.makeText(getActivity(), "Wait next Version", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });
        Adapter adapterClass = new Adapter(getContext(), Itemsofegypt);
        listView.setAdapter(adapterClass);

        return view;
    }

    public void AddingToList5() {
        Itemsofegypt.add(new MacFood(
                getString(R.string.dessertText1),
                getString(R.string.dessertText2),
                R.drawable.dessert1));

        Itemsofegypt.add(new MacFood(
                getString(R.string.dessertText3),
                getString(R.string.dessertText4),
                R.drawable.dessert2));


        Itemsofegypt.add(new MacFood(
                getString(R.string.dessertText5),
                getString(R.string.dessertText6),
                R.drawable.dessert3));


        Itemsofegypt.add(new MacFood(
                getString(R.string.dessertText7),
                getString(R.string.dessertText8),
                R.drawable.dessert4));

        Itemsofegypt.add(new MacFood(
                getString(R.string.dessertText1),
                getString(R.string.dessertText4),
                R.drawable.dessert5));

        Itemsofegypt.add(new MacFood(
                getString(R.string.dessertText3),
                getString(R.string.dessertText6),
                R.drawable.dessert6));
        Itemsofegypt.add(new MacFood(
                getString(R.string.dessertText2),
                getString(R.string.dessertText8),
                R.drawable.dessert7));
    }
}
