package array;

public class Array1 {
	public static void main(String[] args) {
		String a[]= {"velocity", "Testing", "Class","Pune"};
		char[]b= {'%','2','@'};
		int[] c=new int[3];
		int d[]=new int[4];
		String[]e=new String[5];
		char f[]=new char[4];
		int size = a.length;
		System.out.println("size of a is "+size);
		for (int i=0; i<=a.length-1; i++)
		{
			System.out.print(a[i]+",");
		}
		System.out.println();
		for (int i=0; i<=b.length-1; i++)
		{
			System.out.print(b[i]+",");
		}
		System.out.println();
		System.out.println("size of a is "+size);
		for (int i=0; i<=c.length-1; i++)
		{
			System.out.print(c[i]+",");
		}
		System.out.println();
		for (int i=0; i<=d.length-1; i++)
		{
			System.out.print(d[i]+",");
		}
		System.out.println();
		System.out.println(e[4]);
		System.out.println(f[3]);
	}

}
