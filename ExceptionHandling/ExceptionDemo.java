package ExceptionHandling;


public class ExceptionDemo 
{
	public static void main(String[] args) 
	{
		try 
		{
			System.out.println(100/0.1);
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		finally 
		{
			System.out.println("Finally Block will Execute if error or without any error");
		}
	}

}
