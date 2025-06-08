package ObjectDemo;

public class ObjDemo 
{
	String str = "My name";
	int age = 20;
	
	String name;
	int height;
	
	//There are two types of Constructor
	//1. Parameterized Constructor
	//2. Non Parameterized Constructor
	
	// If the programer is not initilised and constructor JVM will add the default constructor during Object Object creation
	// Constructor name should be always class name
	
	// Non Parametersized Constructor 
	ObjDemo()
	{
		
	}
	
	
	
	// Parameterised Constructor
	ObjDemo(String n, int h)
	{
		this.name = n;
		this.height = h;
		//super();
	}
	
	
	
	public void data2() 
	{
		System.out.println("Name is "+ name + " Height is " + height );
	}
	
	
	
	public void data() 
	{
		System.out.println(str + " and age is " + age);
	}
}


