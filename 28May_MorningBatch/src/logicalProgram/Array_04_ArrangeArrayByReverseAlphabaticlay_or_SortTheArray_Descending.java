package logicalProgram;

import java.util.Arrays;

public class Array_04_ArrangeArrayByReverseAlphabaticlay_or_SortTheArray_Descending {
	public static void main(String[] args) {
		String ars[] = {"Velocity","Class","Pune","Katraj"};
		String [] ar = {"Akshay","Rajendra","Bhosale"};
		
		int[] num =new int[4];
		num[0]=1;
		num[1]=2;
		num[2]=3;
		num[3]=4;
		
		int[] no=new int[4];
		no[0]=10;
		no[1]=20;
		no[2]=30;
		no[3]=40;
		
		Arrays.sort(ars);
		Arrays.sort(ar);
		Arrays.sort(num);
		Arrays.sort(no);
		
		for(int i=ars.length-1; i>=0; i--)
		{
			System.out.print(ars[i]+",");
		}
		System.out.println();
		System.out.println("==================>");
		for(int i=ar.length-1; i>=0; i--)
		{
			System.out.print(ar[i]+",");
		}
		System.out.println();
		System.out.println("==================>");
		for(int i=num.length-1; i>=0; i--)
		{
			System.out.print(num[i]+",");
		}
		System.out.println();
		System.out.println("==================>");
		for(int i=no.length-1; i>=0; i--)
		{
			System.out.print(no[i]+",");
		}
		System.out.println();
		System.out.println("==================>");
	}
	
	
}


