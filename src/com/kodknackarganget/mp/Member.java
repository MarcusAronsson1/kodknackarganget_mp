package com.kodknackarganget.mp;

import java.util.ArrayList;
import java.util.HashMap;

public class Member {
    private String name;
    private int id;
    private String email;
    private double costPerHour;
    private double hoursWorked;
    private ArrayList<String> taskNames;

    public Member(String name, int id, String email, double costPerHour){
        this.name = name;
        this.id = id;
        this.email = email;
        this.costPerHour = costPerHour;
        this.hoursWorked = 0;
        this.taskNames = new ArrayList<>();
    }

    public void addTask(String taskName){       //Adding the name of a task to a member
        this.taskNames.add(taskName);
    }

    public void addHoursWorked(double hours){      //Adding on hours to the total amount of hours a member has worked
        hoursWorked += hours;
    }


    
    //Getters and Setters
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public double getCostPerHour() {
        return costPerHour;
    }

    public ArrayList<String> getTaskNames() {
        return taskNames;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

}
