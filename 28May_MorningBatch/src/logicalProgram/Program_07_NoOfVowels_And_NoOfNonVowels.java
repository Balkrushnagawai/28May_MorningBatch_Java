package logicalProgram;

public class Program_07_NoOfVowels_And_NoOfNonVowels {
	public static void main(String[] args) {
		String s="Balkrushna";
		String s1=s.toLowerCase();
		int countofVowels=0;
		int countofNonVowels=0;
		for(int i=0; i<=s.length()-1; i++)
		{
			char t = s1.charAt(i);
			if(t=='a'||t=='e'||t=='i'||t=='o'||t=='u')
			{
				countofVowels++;
			}
			else
			{
				countofNonVowels++;
			}
		}
		System.out.println("Count of Vowels is "+countofVowels);
		System.out.println("Count of Non-Vowels is "+countofNonVowels);
	}

}
