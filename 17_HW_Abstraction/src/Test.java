
public class Test {

	public static void main (String[] args) 
	{
	    
        // creating an instance of Bicycle
        // doing some operations
        Bicycle bicycle = new Bicycle();
        bicycle.changeGear(2);
        bicycle.speedUp(3);
        bicycle.applyBrakes(1);
        bicycle.whatIsInterface();
        Vehicle2.rulesInterface();
        
        System.out.println("Bicycle present state :");
        bicycle.printStates();
        
        // creating instance of the bike.
        MotorCycle bike = new MotorCycle();
        bike.changeGear(1);
        bike.speedUp(4);
        bike.applyBrakes(3);
        
        System.out.println("Bike present state :");
        bike.printStates();
    }

}
