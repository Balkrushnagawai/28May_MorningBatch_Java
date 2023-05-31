package logicalProgram;

public class Program_03_PalondromNumber_UsingString {
	public static void main(String[] args) {
		String s="12321";
		String rev="";
		for(int i=s.length()-1; i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(s);
		System.out.println(rev);
		if(s.equals(rev))
		{
			System.out.println("Given String is Palendrom");
		}
		else
		{
			System.out.println("Given String is not Palendrom");
		}
	}

}
