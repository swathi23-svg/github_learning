package Polymorphism;

public class Overloading 
{
	
    public static void main(String[] args) 
    {
    	//Compile time polymorphism
    	// Method Overloading
        Test t=new Test();
        System.out.println("Greatest Number is "+t.max(10,5));
        System.out.println("Greatest Number is "+t.max(10,15,5));
        
        
        //Runtime polymorphism
        // Method OverRiding
        Sub sb = new Sub();
        sb.display();  // Method OverRiding
        sb.display(20);
        
        
        
    }
    
}