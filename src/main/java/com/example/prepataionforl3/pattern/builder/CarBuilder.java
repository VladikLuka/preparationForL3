package com.example.prepataionforl3.pattern.builder;

public class CarBuilder {
    Car car = new Car();

    public CarBuilder setId(int id){
        car.setId(id);
        return this;
    }

    public CarBuilder setModel(String model){
        car.setModel(model);
        return this;
    }

    public CarBuilder setWheels(int wheels){
        car.setWheels(wheels);
        return this;
    }

    public CarBuilder setMaxSpeed(int maxSpeed){
        car.setMaxSpeed(maxSpeed);
        return this;
    }

    public Car build(){
        return car;
    }
}
