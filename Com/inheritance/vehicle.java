package Com.inheritance;
   
public class vehicle {
	

	static String  color = "red";
	static int price = 1234;
	
	
    public static void bikeone()
    {
    	String color = "black";
		String model = "splendor";
		int price = 4321;
		System.out.println(" Super class statments " +color);
		//return color+model+price;
    }
    public void bus()
    {
    	System.out.println("Public and private bus");
    }
}
