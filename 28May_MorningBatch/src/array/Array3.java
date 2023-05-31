package array;

public class Array3 {
	public static void main(String[] args) {
		int a[]= {12,34,43,45,65,7};
		int[] b= {12,34,65,6};
		//no of data to be stored
		int c[]=new int[3];
		int[] d=new int[4];
		c[0]=10;
		c[1]=11;
		c[2]=12;
		
		d[0]=20;
		d[1]=21;
		d[2]=22;
		int size = a.length;
		System.out.println("size of array a is "+size);
		int size1 =b.length;
		System.out.println("size of array b is " +size1);
		int size2 =c.length;
		System.out.println("size of array c is "+size2);
		int size3 =c.length;
		System.out.println("size of array d is "+size3);
		
		for(int i=0; i<=a.length-1; i++)
		{
			System.out.print(a[i]+",");
		}
		System.out.println();
		for(int i=0; i<=b.length-1; i++)
		{
			System.out.print(b[i]+",");
		}
		System.out.println();
		for(int i=0; i<=c.length-1; i++)
		{
			System.out.print(c[i]+",");
		}
		System.out.println();
		for(int i=0; i<=d.length-1; i++)
		{
			System.out.print(d[i]+",");
		}
		
	}

}
