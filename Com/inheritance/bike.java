package Com.inheritance;

public class bike extends vehicle {
	
	public static void bikeone()
	{
	    String name = "maruthi";
		System.out.println("bike extends from the vehicle");
		System.out.println("bike name " +name);
		System.out.println("bike color is " +vehicle.color);
		
		
		//return color;
		
	}
	public static void main(String args[])
	{
		
		bike obj = new bike();
		obj.color = "blue";
		obj.bikeone();
		vehicle.bikeone();
		obj.bus();
	}
}
