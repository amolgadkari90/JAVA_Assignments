package com.tka.objects;

public class MobilePhone {

	String brand;
    String model;
    String color;
    int	megaPixel;		// in mega pixel 
    int storageMem;		// GB
    int ram;			// GB
    int batterySize;	// Ah
    int processorSpeed;	// GHz
    
    int batteryLevel;	// Monitoring battery level

    // Methods
    
    
    public void displayMobileDetails() {
        System.out.println("Brand Name: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Camera resolution: " + megaPixel +"MP");
        System.out.println("Memory Storage Capacity: " + storageMem +"GB");
        System.out.println("RAM Memory Capacity: " + ram +"GB");
        System.out.println("Processor Speed: " + processorSpeed +"GHz");
        System.out.println("Battery Capacity: " + batterySize +"mAh");
    }

    public void makeCall(String phoneNumber) {
        if (batteryLevel > 0) {
            System.out.println("Calling " + phoneNumber + "...");
            batteryLevel -= 10; // Assume a call uses 10% battery
        } else {
            System.out.println("Battery is dead. Please charge your phone.");
        }
    }

    public void chargePhone() {
        batteryLevel = 100;
        System.out.println("Phone fully charged.");
    }
}
