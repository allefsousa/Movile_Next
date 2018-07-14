package com.example.allef.next.movilenext01;

import android.arch.lifecycle.ViewModelProviders;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Chronometer;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Chronometer chronometer = findViewById(R.id.chrometer);

        ChrometerViewModel chrometerViewModel = ViewModelProviders.of(this).get(ChrometerViewModel.class);


        if(chrometerViewModel.getStartTime() == null){
            long startTime = SystemClock.elapsedRealtime();
            chrometerViewModel.setStartTime(startTime);
            chronometer.setBase(startTime);
        }else {
            chronometer.setBase(chrometerViewModel.getStartTime());
        }
        chronometer.start();

    }
}
