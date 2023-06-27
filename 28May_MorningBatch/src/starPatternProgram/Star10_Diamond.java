package starPatternProgram;

public class Star10_Diamond {
	public static void main(String[] args) {
		int space =16;
		int star=1;
		for(int i=1; i<=31; i++) {
			for(int a=1; a<=space; a++)
			{
				System.out.print(" ");
			}
			for(int a=1; a<=star; a++)
			{
				System.out.print("*");
			}
			System.out.println();
			if(i<16)
			{
				star=star+2;
				space--;
			}
			else
			{
				star=star-2;
				space++;
			}
		
	}
	}
}
