package starPatternProgram;

public class Star_TriangleRightDescending {
	public static void main(String[] args) {
		for(int i=1; i<=10; i++)
		{
			for(int a=0; a<=10-i; a++)
			{
				System.out.print("*");
			}
			System.out.println();
			for(int a=0; a<=i; a++)
			{
				System.out.print(" ");
			}
			
		}
	}

}
