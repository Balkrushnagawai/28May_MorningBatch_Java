package logical_Program1;

public class J_Prime_Number_Identification {
	public static void main(String[] args) {
		int a=67;
		int count=0;
		
		//Prime Number-->The number only by 1 and its own value
		for(int i=2; i<=66; i++)
		{
			if (a%i==0)
			{
				count++;
			}
		}
		if(count ==1)
		{
			System.out.println("Given value is Prime Number");
		}
		else
		{
			System.out.println("Given value is not Prime number");
		}
	
	}

}
