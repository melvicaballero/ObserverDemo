package com.jala;

import java.util.ArrayList;

public class EmploymentAgency implements Observable {
    protected ArrayList<Observer> observers = new ArrayList<>();

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notify(JobPost job) {
        for (Observer obs : observers) {
            obs.update(job);
        }
    }


    public void addJob(JobPost job) {
        notify(job);
    }
}
