package AccessModifierDemo;

public class PrivateDemo 
{
	// Packages is a collection of class, interface or other packages. Package is used for Organizing the project
	// Access Modifier
	//1 Default
	//2 Private
	//3 Protected
	//4 Public
	
	
	/*
	 * 
	 * 
	 * 1. Default : When a member is not prefixed with any access modifier it is known as default. Same Package different class
	 * 2. Private : Private is a access modifier.Any member defined as private can be used only with in the same or different package.
	 * 3. Protected : Protected is a new access modifier, A member prefixed as protected can be used any where with in the package OR same
	 * 4. Public : Public is a access modifier. Any member defined as public can be used with in the package or Outside the package.
	 * 
	 */
	private static String name = "Automation";
	
	public static void main(String[] args)
	{
		System.out.println("Name of the String is "+name);
		
	}
}
