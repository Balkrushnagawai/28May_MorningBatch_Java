package demo;

public class Rev_String {
	public static void main(String[] args) {
		String vel = "VelocityKatrajPuneKatraj";
		String vel1 =vel.toLowerCase();
		System.out.println("Total No of Character"+vel.length());
		int noOfVowels=0;
		int noOfNonVowels =0;
		for(int i=0; i<=vel1.length()-1; i++)
		{
			char a =vel1.charAt(i);
			if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u')
			{
				noOfVowels++;
			}
			else
			{
				noOfNonVowels++;
			}
		}
		System.out.println("noOfVowels = "+noOfVowels);
		System.out.println("noOfNonVowels = "+noOfNonVowels);
	}
}
