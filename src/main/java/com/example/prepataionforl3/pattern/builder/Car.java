package com.example.prepataionforl3.pattern.builder;

public class Car {
    private int id;
    private String model;
    private int wheels;
    private int maxSpeed;

    private Car(){}

    public int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public int getWheels() {
        return wheels;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", wheels=" + wheels +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}

