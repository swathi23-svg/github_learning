package ObjectDemo;

public class ObJTest1 
{
	public static void main(String[] args) 
	{
		// Object Creation   / new ObjDemo is Initilisation 
		ObjDemo ob = new ObjDemo();
		ob.data();
		//ob.data2();
		
		// new Object Creation with Parametrised constructor
		
		ObjDemo ob1 = new ObjDemo("James", 6);
		ob1.data2();
	}

}
