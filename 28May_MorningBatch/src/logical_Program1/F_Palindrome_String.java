package logical_Program1;

public class F_Palindrome_String {
	public static void main(String[] args) {
		String a= "eye";
		
		String c ="";
		
		for(int i=a.length()-1; i>=0; i--)
		{
			c=c+a.charAt(i);
		}
		System.out.println("String a is "+a);
		System.out.println("String a is "+c);
		if(a.equals(c))
		{
			System.out.println("String is Palendrom");
		}
		else 
		{
			System.out.println("String is not Palendrom");
		}
	}

}
