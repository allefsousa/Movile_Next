package com.example.allef.next.movilenext01;

import android.arch.lifecycle.ViewModel;

public class ChrometerViewModel extends ViewModel {
    private Long startTime;

    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }
}
