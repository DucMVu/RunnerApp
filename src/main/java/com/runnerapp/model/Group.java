package com.runnerapp.model;

import java.util.List;

public class Group {
    private Pace pace;
    private Distance distance;
    private List<Runner> runners;

    public Group() {}

    public Group(Pace pace, Distance distance, List<Runner> runners) {
        this.pace = pace;
        this.distance = distance;
        this.runners = runners;
    }

    public Pace getPace() {
        return pace;
    }

    public void setPace(Pace pace) {
        this.pace = pace;
    }

    public Distance getDistance() {
        return distance;
    }

    public void setDistance(Distance distance) {
        this.distance = distance;
    }

    public List<Runner> getRunners() {
        return runners;
    }

    public void setRunners(List<Runner> runners) {
        this.runners = runners;
    }
}
