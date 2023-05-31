package logicalProgram;

public class Array_05_ReverseTheData_In_SameArray {
	public static void main(String[] args) {
		int a[] = {10,20,30,40,50,60};
		int b[]=new int[a.length]; //Take new blank array with same size
		
		for (int i=0; i<=a.length-1; i++)
		{
			b[i]=a[(a.length-1)-i];
		}
		a=b;
		for (int i=0; i<=a.length-1; i++)
		{
			System.out.print(a[i]+",");
		}
		System.out.println();
		System.out.println("==============>");
		
		String [] ar = {"Akshay","Rajendra","Bhosale","Velu"};
		String[] ar1 = new String [ar.length]; //take new array with same size
		for(int i=0; i<=ar.length-1; i++)
		{
			ar1[i] =ar[(ar.length-1)-i];
		}
		ar=ar1;
		for(int i=0; i<=ar.length-1; i++)
		{
			System.out.println(ar);
		}
		}
	
	
}



