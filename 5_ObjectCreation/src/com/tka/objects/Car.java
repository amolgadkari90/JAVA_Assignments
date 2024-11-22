package com.tka.objects;

public class Car {
	
    String brand;
    String model;
    String colour;
    int year;
    double kmRun;
    int maxSpeed;
    

    // Methods
    public void displayCarDetails(){
        System.out.println("Brand Name: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Colour: " + colour);
        System.out.println("Mfg. year:" + year);
        System.out.println("Usage: " + kmRun + "km");
        System.out.println("Max speed:" + maxSpeed);
    }


}
