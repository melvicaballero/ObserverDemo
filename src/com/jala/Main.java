package com.jala;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // Create subscribers
        JobSeeker joeWatts = new JobSeeker("Joe Watts");
        JobSeeker janeDoe = new JobSeeker("Jane Doe");

// Create publisher and attach subscribers
        EmploymentAgency agency = new EmploymentAgency();
        agency.attach(joeWatts);
        agency.attach(janeDoe);

// Add a new job and see if subscribers get notified
        agency.addJob(new JobPost("Software Engineer"));

    }
}
