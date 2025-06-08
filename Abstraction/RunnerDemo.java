package Abstraction;

public class RunnerDemo 
{
	public static void main(String[] args) 
	{

		//AbstractBike is a subclass
		AbstractBike b1= new AbstractBike("SuperBike",100);
		b1.run();
		b1.testMethod();
		b1.showBike();
		
		
		
		// Object cannot be created for super class
		// AbstractVehicle v1 = new AbstractVehicle("SuperBike"); 
		
		
	}
	

}
