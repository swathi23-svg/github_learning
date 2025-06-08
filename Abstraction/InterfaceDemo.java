package Abstraction;


public class InterfaceDemo implements InterLinon1, InterTiger2, InterCow3, InterBufollow4
{
	// Interface is a member in java which is used to achieve abstraction
	// Interface is also a blue print.
	// 
	public void Buf() 
	{
		System.out.println("Pulling a Tractor ");
	}
}

interface InterLinon1
{
	
	
}

interface InterTiger2
{
	
	
}


interface InterCow3
{
	
	
}

interface InterBufollow4
{
	// By default Public static final Variable
	String ds = "Some Name";
	//Abstract Method
	//heap memory
	public void Buf();
	
	//Concrete Method 
	// Static Memory
	public static void pull() 
	{
		System.out.println("Pulling a Cart ");
	}
}

