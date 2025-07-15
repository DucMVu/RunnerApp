package com.runnerapp.model;

public class Runner {
    private Long id;
    private String name;
    private Pace pace;
    private Distance distance;

    public Runner() {}

    public Runner(Long id, String name, Pace pace, Distance distance) {
        this.id = id;
        this.name = name;
        this.pace = pace;
        this.distance = distance;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
}
