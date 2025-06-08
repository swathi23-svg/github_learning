package Com.basic;

public class method_overloading {
 
	public static int a = 10,b=20,res;
	//a=20;
	//b=30;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
    	   System.out.println("multiplication of 2 numbers " +mul());
    	   System.out.println("multiplication of 2 numbers " +info());
    	   mul(3,4);
    	   info();
	}
       static int mul()
       {
    	   //res= 2*3;
    	   res = a*b;
    	   return res;
       }
       
       static void mul(int a, int b)
       {
       System.out.println("multiplication of 2 numbers " +(a*b));
       }
	
      static String info()
      {
    	  String name ="name1";
    	  String namet ="name2";
    	  return name + namet;
      }
}
