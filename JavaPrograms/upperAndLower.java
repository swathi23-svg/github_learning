package JavaPrograms;

public class upperAndLower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str = "AutomaTion TEStinG";
		int upperCount = 0;
		int lowerCount = 0;
		String up = " ";
		int i;
		
		
		for(i = 0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			//if(ch=>65 && ch<=90)
			//if (ch >= 'A' && ch <= 'Z')
			if(Character.isUpperCase(ch))
			{
				upperCount++;
				up = up+ch;
				//System.out.println("UPper case letters are " +up);
			}
			if(Character.isLowerCase(ch))
			{
				lowerCount++;
			}
		}
		System.out.println("Uppercase letter are " +upperCount);
		System.out.println("lowercase letter are " +lowerCount);
		System.out.println("UPper case letters are " +up);
	}
	
}
