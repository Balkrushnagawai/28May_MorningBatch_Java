package string;

public class EqualTo_EqualTo_Operator {
	public static void main(String[] args) {
		String s1 ="Akshay";
		String s2 ="Akshay";
		String s3 =new String ("Akshay");
		
		// "==" operator are used for reference/address comparison
		System.out.println(s1==s2); 
		System.out.println(s1==s3);
		
		
	}

}
