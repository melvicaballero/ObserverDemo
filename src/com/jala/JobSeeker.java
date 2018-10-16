package com.jala;

public class JobSeeker implements Observer {
    private String name;
    public JobSeeker(String name){
        this.name=name;
    }

    @Override
    public void update(JobPost job){
        // Do something with the job posting
       System.out.println("Hi " + this.name + "! New job posted: "+ job.getTitle());
    }
}
