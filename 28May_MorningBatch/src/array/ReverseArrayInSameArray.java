package array;

public class ReverseArrayInSameArray {
	public static void main(String[] args) {
		int [] a= {12,34,32,76,34,87,31};
		int [] b=new int[a.length];
		int size = a.length;
		for (int i=0; i<=a.length-1; i++)
		{
			System.out.print(a[i]+",");
		}
		System.out.println();
		for (int i=0; i<=a.length-1; i++)
		{
			b[i]=a[(a.length-1)-i];
		}
		a=b;
		for (int i=0; i<=a.length-1; i++)
		{
			System.out.print(a[i]+",");
		}
		
		
	}

}
