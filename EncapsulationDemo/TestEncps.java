package EncapsulationDemo;

public class TestEncps
{
	
	public static EncapsDemo ec;
	public static void main(String[] args) 
	{
		ec = new EncapsDemo();
		ec.set_name("Automation");
		//System.out.println(ec.get_name());
		
		display();
		displayA();
		System.out.println(ec.get_name());
		
	}
	
	
	public static  void display() 
	{
		System.out.println("My Name is one " + ec.get_name() );
	}
	
	public static void displayA() 
	{
		ec.set_name("UFT");
		System.out.println("My Name is " + ec.get_name() );
	}

}
