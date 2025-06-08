package Abstraction;

//Abstract class
public abstract  class AbstractVehicle 
{

	String name;
	// Constructor
	AbstractVehicle(String n)
	{
		name =n;
	}
	
	
	
	// Abstract method
	public abstract void run();
	
	
	// Non abstract method
	// Concrete method
	
	public void testMethod() 
	{
		System.out.println("This is non Abstract method of Vehicle class");
	}
	

}
