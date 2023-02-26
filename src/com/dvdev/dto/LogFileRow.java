package com.dvdev.dto;

import java.time.LocalTime;

public class LogFileRow {

    private final LocalTime time;
    private final String activityName;

    public LogFileRow(LocalTime time, String activityName) {
        this.time = time;
        this.activityName = activityName;
    }

    public LocalTime getTime() {
        return time;
    }

    public String getActivityName() {
        return activityName;
    }
}
