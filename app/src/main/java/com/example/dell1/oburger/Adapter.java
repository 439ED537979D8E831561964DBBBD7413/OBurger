package com.example.dell1.oburger;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Adapter extends ArrayAdapter<MacFood> {
    public Adapter(Context context, ArrayList<MacFood> country) {
        super(context, 0, country);
    }
    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        MacFood Mac = getItem(position);
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext())
                    .inflate(R.layout.item_of_list, parent, false);
        }
        TextView tex1 = (TextView) convertView.findViewById(R.id.tvRow);
        tex1.setText(Mac.getText1());
        TextView tex2 = (TextView) convertView.findViewById(R.id.tvRow2);
        tex2.setText(Mac.getText2());
        ImageView imageView = (ImageView) convertView.findViewById(R.id.ivRow);
        imageView.setImageResource(Mac.getImage());
        return convertView;
    }
}
