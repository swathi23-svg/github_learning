package Com.basic;

public class object_class {
	
	String subject1;
	String subject2;
	int marks;
	//System.out.println(" Print ststment of Main object class");
	
	public void object_class()
	
	{
		System.out.println(" Print ststment of Non  parameter contructor");
		this.subject1 = "Maths";
		this.subject2 ="science";
		this.marks = 120;
		System.out.println("Subjects  " +subject1 +","  +subject2+" and marks is "+marks);
	}
	
	public String object_class(String classs,String subject3)
	
	{
		System.out.println(" Print ststment of parameter contructor");
		
		System.out.println("Class is " +this.subject1 +" and Subjects 3 is "+subject3);
		String res = classs+subject3;
		return res;
		
	}


}
