package logical_Program1;

public class D_reverse_String {

	public static void main(String[] args) {
		String ard ="velocity";
		String result="";
		for(int  i=ard.length()-1; i>=0; i--)
		{
			result =result+ ard.charAt(i);
		}
		System.out.print(result);
	
			

	}

}
