package com.example.allef.next.movilenext01;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class LiveDataActivity extends AppCompatActivity {

    private TextView TvTimer;

    private LivedataTimerViewModel livedataTimerViewModel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_live_data);
        TvTimer = findViewById(R.id.tvTimer);

        livedataTimerViewModel = ViewModelProviders.of(this).get(LivedataTimerViewModel.class);
        subscribe();


    }

    private void subscribe() {
        final Observer<Long> elapsedTimeObserver = new Observer<Long>() {
            @Override
            public void onChanged(@Nullable Long aLong) {
                TvTimer.setText(aLong + "Segundos se passaram. ");
            }

        };


        livedataTimerViewModel.getElapsedTime().observe(this,elapsedTimeObserver);


    }
}
