package logicalProgram;

public class Program_06_Vowels {
	public static void main(String[] args) {
		String s="Balkrushna";
		String s1 = s.toLowerCase();
		int count =0;
		for(int i=s1.length()-1; i>0; i--)
		{
			char c =s1.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
			{
				count++;
			}
		}
		System.out.println(count);
		
	}

}
