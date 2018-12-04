package com.kodknackarganget.mp;

import java.util.ArrayList;

public class Project {

    public static int INITIAL_HOURS = 0;
    public static final String ls = System.lineSeparator();

    private String name;
    private ArrayList<Task> tasks;
    private ArrayList<Member> projectMembers;
    private ArrayList<Risk> projectRisks;
    private Schedule schedule;
    private double projectBudget;




    public Project(String name, int startWeek, int endWeek, double hourBudget, double projectBudget) {

        this.name = name;
        this.tasks = new ArrayList<>();
        this.projectMembers = new ArrayList<Member>();
        this.projectRisks = new ArrayList<>();
        this. schedule = new Schedule(startWeek, endWeek, hourBudget);
        this.projectBudget = projectBudget;

    }

    public double calculateCostVariance() {

    }
    public double calculateEarnedValue() {

    }
    public double calculateScheduleVariance() {

    }
    /* public int getTotalHours(Member member) {

        int totalHours = INITIAL_HOURS;

        for(Member member : projectMembers) {

            totalHours += projectMembers.getHoursWorked;
        }

        return totalHours;
    } */

    public String getTotalHoursPerMember() {
        String information = "";

        for(Member currentMember : projectMembers) {

            information = currentMember.getName() + " has worked a total of" + currentMember.getHoursWorked() + " hours." + ls;
        }

        return information;
    }

    public double totalProjectHours() {
        double totalHours = INITIAL_HOURS;

        for(Member currentMember : projectMembers) {

            totalHours += currentMember.getHoursWorked();
        }

        return totalHours;
    }

    public int getRisk(Risk riskDescription) {

        return riskDescription.calculateRisk;

    }

    public String getMembers() {

        String information = "";
        information = "Members within the project " + getName() + ":" + ls;

        for(Member currentMember : projectMembers) {

            information = currentMember.getName();
        }

        return information;
    }

    public Task getTasks() {

        String 

    }

    public double getTotalCost() {

    }

    public String getCompletedTasks() {

    }

    public String getCurrentTasks() {

    }

    public Member getMember(int id) {

    }

    public Member getMember(String name) {

    }

    public int getWeek() {

    }

    public void addMember(int id) {

    }

    public void addTask(String description, int startWeek, int endWeek, double hourBudget, double moneyBudget) {

    }

    public void addRisk(String description, int impact, int probability) {

    }

    public void setSchedule(int startWeek, int endWeek, double hourBudget) {

    }

    public String getName() {
        return name;
    }

    public double getProjectBudget() {
        return projectBudget;
    }

    public void setName(String newName) {

    }

    public void setProjectBudget(double newProjectBudget) {

    }










}

