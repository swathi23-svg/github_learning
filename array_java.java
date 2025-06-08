package Com.basic;

public class array_java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//An array is a container object that holds a fixed number of values of a single type.
       String[] name = new String[6];
       name[0] = "Swathi";
       name[1] = "Ahana";
       name[2] = "123";
       name[3] = "Swathi";
       name[4] = "Ahana";
       name[5] = "123";
       //name[6]= "hai"; error Index 6 out of bounds for length 6
       
       int a = name.length;
       
       for (int i = 0;i<a;i++)
       {
    	   System.out.println("List of  array details " +name[i]);
       }
       
       for(String n: name)
       {
    	   System.out.println("List of arrays details in advanced " +n);
       }
	}

}
