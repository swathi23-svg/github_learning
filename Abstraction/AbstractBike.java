package Abstraction;


//Concrete class
public  class AbstractBike extends AbstractVehicle
{
	int speed;
	
	//Constructor
	AbstractBike(String n, int s)
	{
		super(n);
		speed = s;	
	}
	
	
	
	public void run() 
	{
		System.out.println("Bike is running");
	}
	
	
	
	public void showBike() 
	{
		System.out.println("Name of bike is "+ name);
		System.out.println("Speed of "+name +" is "+ speed);
	}
}
