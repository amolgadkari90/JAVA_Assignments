package com.tka.objects;

public class TrafficSignal {

	String currentColor;
	String signal;

    // Methods
    public void changeColor(String newColor) {
    		if (newColor == "Red") {
    			signal = "Stop";
    			System.out.println("Traffic light changed to: " + currentColor +"Signal = " +signal);
    		}
    		else if (newColor == "Yellow"){
    			signal = "Slow";
    			System.out.println("Traffic light changed to: " + currentColor +"Signal = " +signal);
    			
    		} 
    		else if (newColor == "Green"){
    			signal = "Go";
    			System.out.println("Traffic light changed to: " + currentColor +"Signal = " +signal);
    			
    		}
    		else {
                System.out.println("Invalid color: " + newColor);
    	} 
        
    }

    public String getCurrentColor() {
        return currentColor;
    }
}
