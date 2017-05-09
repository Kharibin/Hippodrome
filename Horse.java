package com.javarush.task.task21.task2113;

/**
 * Created by Java on 09.05.2017.
 */
public class Horse {

    //fields
    private String name;
    private double speed, distance;

    public String getName() {
        return name;
    }

    public double getSpeed() {
        return speed;
    }

    public double getDistance() {
        return distance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }


    //Constructor

    public Horse(String name, double speed, double distance) {
        this.name = name;
        this.speed = speed;
        this.distance = distance;
    }


    //Methods

    public void move(){

    }

    public void print(){

    }
}
