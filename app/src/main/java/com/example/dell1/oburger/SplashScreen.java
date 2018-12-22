package com.example.dell1.oburger;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class SplashScreen extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        final MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.obr2);
        Thread myThread = new Thread(){
            @Override
            public void run() {
                try {
                    mp.start();
                    sleep(12000);
                    Intent intent = new Intent(getApplicationContext(),SideMenu.class);
                    startActivity(intent);
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        myThread.start();
    }
}