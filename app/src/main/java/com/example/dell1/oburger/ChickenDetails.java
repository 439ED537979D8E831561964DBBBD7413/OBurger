package com.example.dell1.oburger;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class ChickenDetails extends AppCompatActivity {

    View l;
    TextView t;
    Boolean b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chicken_details);
        l=findViewById(R.id.info_layout);
        l.setVisibility(View.INVISIBLE);
        b=true;
    }

    public void more_information(View view) {
        if(b==true) {
            l.setVisibility(View.VISIBLE);
            b=false;
        }
        else {
            l.setVisibility(View.INVISIBLE);
            b=true;
        }


    }
}
