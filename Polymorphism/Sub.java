package Polymorphism;

class Sub extends Super
{
	
	@Override
	public void display() 
	{
		System.out.println("Sub class Display");
	}
	
	
	public void display(int x) 
	{
		System.out.println("Sub class Display" +x);
	}
}
