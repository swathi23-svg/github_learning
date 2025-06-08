package JavaPrograms;

//import javax.swing.text.AttributeSet.CharacterAttribute;

public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Swathi";
		String res = " ";
		
		int i;
		
		for (i=str.length()- 1;i >= 0;i--)
		{
			char ch =str.charAt(i);
			res = res +ch;
			
			System.out.println("Reverse letter " +ch);
			
		}
		System.out.println("Uppercase letter are " +res);
		
		/*  String str = "Swathi";

		        // Using StringBuilder to reverse the string
		        StringBuilder sb = new StringBuilder(str);
		        String reversedString = sb.reverse().toString(); // Reverse and convert to string

		        System.out.println("Reversed string is: " + reversedString); */

	}

}
