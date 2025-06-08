package JavaPrograms;

public class largestOfTwoNum {
	public static void main(String[] args)
	{
		int a =10;
		int b = 40;
		int largNum = Math.max(a, b);
		int c1 = Math.min(a, b);
		System.out.println("largest of 2 number is " +largNum);
	

	int c = 10;
	int d = 20;

	// Using the ternary operator to find the larger number
	int largest = (c > d) ? c : d;

	System.out.println("The largest number is: " + largest);
	}

}
