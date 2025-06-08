package Com.basic;

public class basic_operators {

	static int x =10;
	static int y= 14;
	static int res = x+y;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Arithmetic operators
		// 1. Addition
		
		System.out.println(" Addition operator");
		int a =2;
		int b = 5;
		String k = "30";
		int i= 20;
		
		System.out.println("addition of 2  numbers " +(a+b)); //7
		System.out.println("addition of 2  numbers without bracket " +a+b); //25
		System.out.println("addition of numbers 3+4 " +3+4); //34
		System.out.println("addition of 2 numbers is " + (3+4)); //7
		System.out.println("addition of 2  numbers " +res); //24
		System.out.println("addition of 2  numbers  string and int " +(k+i)); //
		//2. Subtraction
		System.out.println(" Subtraction operator");
		int c = 22;
		int d = 8;
		System.out.println("subtraction  of 2  numbers " +(c-d)); //7
		//System.out.println("subtraction of 2  numbers without bracket " +c-d); // operator - is undefined
		//System.out.println("subtraction of numbers 3+4 " +3-4); // operator - is undefined
		System.out.println("addition of 2 numbers is " + (13-4)); //7
        
		//3.multiplication
		System.out.println(" multiplication operator");
		
		System.out.println("multiplication of 2  numbers " +(c*d)); //176
		
		//4. Division - returns quotient
		System.out.println("Division  operator");
		float ax = 57;
		float bx = 3;
		
		System.out.println("division of 2  numbers " +(ax/bx)); //19.0
		System.out.println("division of 2  numbers " +(57/3)); //
		
		//% modulus Returns the division remainder
		System.out.println("Modulus operator");
		System.out.println("results of two values" +(4%3));
		System.out.println("results of two values" +(ax%bx));
		
		//increment 
		System.out.println("increment operator");
		int a1 = 2;
		int a2;
		a2 = ++a1; // first increment the value of a1 2 to 3 then assign the a1 value 3 to a2)
		System.out.println("pre increment values of  a1" +a1);
		System.out.println("pre increment values of a2 " +a2);
		a2 = a1++; // first assign the a1 value 3 to a2 then increment the a1
		System.out.println("pre increment values of  a1" +a1);
		System.out.println("pre increment values of a2 " +a2);
		
		//Decrement 
		
		int b1 = 5;
		int b2 = --b1;
		int b3 = b1--;
		System.out.println("pre decrement values of  b1" +b2);
		System.out.println("pre decrement values of  b1" +b1);
		System.out.println("post decrement values of b1 " +b3);
		System.out.println("post decrement values of b1 " +b1);
		
		
		
		
		
		
	}

}
