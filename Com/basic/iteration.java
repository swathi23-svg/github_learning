package Com.basic;

public class iteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for loop here we can initialize the value outside and inside the for loop
		int a = 0;
		int b = 4;
		
		for(a=0;a<=b;a++)// initialize, condition and increment
		{
			System.out.println("initializing the value outside the for loop " +a);
		}
		
		for (int i = 1;i<=5;i++)
		{
			System.out.println(" initializing the value inside the for loop " +i);
		}
		int c = 0;
		for (;c<=5;)
		{
			System.out.println(" incrementing outside the for loop " +c);
			c++;
			
		}
		//while loop , here we can not initialize the values
		int x = 1;
		while(x<10)
		{
			System.out.println(" First while loop  " +x);
			x++;
		}
		int k = 0;
		do
		{
			System.out.println("First statments are running without validating the condition");
			k++;
		}
		while(k<=3);
	}

}
