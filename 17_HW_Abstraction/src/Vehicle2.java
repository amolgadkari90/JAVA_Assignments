
public interface Vehicle2 extends Vehicle
{
	public static void rulesInterface()
    {
    	int i = 1;
       	System.out.println(i+" Interface is an abstract type used to specify the behavior of a class");
       	i++;
    	System.out.println(i+" \"interface\" keyword is used to define interface");
    	i++;
    	System.out.println(i+" \"interface\" does not have constructor");
    	i++;
    	System.out.println(i+" object of the \"interface\" can't be created");
    	i++;
    	System.out.println(i+" class \"implements\" interface");
    	i++;
    	System.out.println(i+" interface \"extends\" interface");
    	i++;
    	System.out.println(i+" interface \"neither implements nor extends \" class as interface is kind of blueprint of the class");
    	i++;
    	System.out.println(i+" multiple inheritance is allowed in the \"interface\":one interface can have multiple parent interfaces ");
    	i++;
    	System.out.println(i+" inside interface all attributes are public static final (pure constant) by default");
    	i++;
    	System.out.println(i+" All methods are public abstract: without implementation body");
    	i++;
    	System.out.println(i+" After java 1.8 onwards default method and static is allowed to have body inside interface ");
    	System.out.println("**********\n");
    }

}
