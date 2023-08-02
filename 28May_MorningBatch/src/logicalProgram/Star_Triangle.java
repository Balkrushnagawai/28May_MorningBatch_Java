package logicalProgram;

public class Star_Triangle {
	public static void main(String[]args)
	{
		int space=15;
		for(int i=1; i<=15; i++)
		{
			for(int a=1; a<=space-1; a++)
			{
				System.out.print(" ");
			}
			for(int a=1; a<=i; a++)
			{
				System.out.print("* ");
			}
			System.out.println();
			space--;
		}
	}

}
