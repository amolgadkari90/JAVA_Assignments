package com.tka.objects;

public class Building {
	String name;
    int floors;
    String address;
    String hasElevator;
   
    // Methods
    public void displayBuildingDetails() {
        System.out.println("Building Name: " + name);
        System.out.println("Floors: " + floors);
        System.out.println("Address: " + address);
        System.out.println("Has Elevator: (Yes : No)" + hasElevator);
    }

}
