package com.tka.objects;

public class RFIDSystem {
	
	 String tagID;
	 boolean isAuthorized;

	    // Methods
	    public void scanTag() {
	        if (isAuthorized) {
	            System.out.println("Access granted for Tag ID: " + tagID);
	        } else {
	            System.out.println("Access denied for Tag ID: " + tagID);
	        }
	    }

	    public void updateAuthorization(boolean authorizationStatus) {
	        isAuthorized = authorizationStatus;
	        System.out.println("Authorization updated for Tag ID: " + tagID);
	    }

}
