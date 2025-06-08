package InterfaceDm;

public class InterfacePractice 
{
    public static void main(String[] args) 
    {
        System.out.println(Test.X);
        Test.meth3();
        My.meth5();
        System.out.println(My.X);
        
    }
}


interface Test
{
	//Global Final variable
    final static int X=10;
    public abstract void meth1();
    public abstract void meth2();
    //Concrete Method 
    public static void meth3()
    {
        System.out.println("Meth3 of Test");
    }
}



interface Test2 extends Test
{
    void meth4();
}


class My implements Test2
{

	//Local variable
	static int X=11;
    public void meth1(){System.out.println("Meth1");}
    public void meth2(){System.out.println("Meth2");}
    public void meth4(){System.out.println("Meth4");}
    public static void meth5() 
    {
    	System.out.println("Hello World");
    }
    
}
