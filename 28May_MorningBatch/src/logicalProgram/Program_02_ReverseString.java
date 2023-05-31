package logicalProgram;

public class Program_02_ReverseString {
	public static void main(String[] args) {
		String s= "Balkrushna";
		String rev ="";
		for(int i=s.length()-1; i>=0; i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(s);
		System.out.println(rev);
	}

}
