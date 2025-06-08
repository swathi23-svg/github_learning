package Com.basic;

public class controlflow_statments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*Controlflow statments 
		1. Selective statments
		2. Ittirativestatments */
		
		//1. Selective statments - if, else. else if and switch
		
		int a = 23,b=34,c=54;
		if (a>23)
		{
			System.out.println("excetuting first statments");
		
		}
		else if (a==b)
		{
			System.out.println("executing second statments");
		}
		else
		{
			System.out.println("executing else statments");
		}
		
		if (a==23)
		{
			System.out.println("Only one if cndition added no else");
		}
		
	
	//2. ittirative statments
	
	String name = "swathi";
	switch (name)
	{
		case "SWATHI":
		System.out.println("My name swathi");
		break;
		case "Ahana":
		System.out.println("Daughter Name");
		break;
		case "Sandhya":
		System.out.println("Cousin name");
		break;
		default:
			System.out.println("Name not matched");
			break;
			
	}
	
}

}
