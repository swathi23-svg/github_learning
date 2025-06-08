package Com.basic;

public class assignment_logical_operator {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int a = 2;
		int b = 4;
		int c = 2;
		int res;
		int res1;
		// equal operator
		//res = (a==b);
		//System.out.println(" = assignment "+res);
		System.out.println(" = assignment "+(a==b));
		System.out.println(" = assignment "+(a==c));
		// > ,>=, <,<= operator Relational operator
		System.out.println(" > assignment "+(a>b));
		System.out.println(" >= assignment "+(a>=c));
		System.out.println(" < assignment "+(a<b));
		System.out.println(" <= assignment "+(a<=c));
		System.out.println(" != assignment "+(a!=c));
		
		//Logical operator
		
		System.out.println("&& opertaor " +((a>b) && (b>c)));
		System.out.println("|| opertaor " +((a>b) || (b>c)));
		System.out.println("! opertaor " + (!((a>b) && (b>c))));

	}

}
