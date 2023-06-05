package array;

public class Array {
	public static void main(String[] args) {
		//Array --> Arrangement in order sequences but sequence in the form of Rows and Colomns.
		//Array is not a data type. Array is a data type.
		
		//Declaration & Initialization
		//dataType arrayName[];
		//dataType[] arrayName;
		// Syntax -- dataType arrayName[]={data};
		// Syntax -- dataType[] arrayName={data};
		int a[]= {10,20,30,40,50};
		int[] b= {11,12,13,14,15};
		//or -- 
		// Syntax -- dataType arrayName[]=new data[4];
		// Syntax -- dataType[] arrayName=new data[4];
		int c[]= new int[4];
		int[] d= new int[4];
		c[0]=21;
		c[1]=22;
		c[2]=23;
		c[3]=24;
		d[0]=31;
		d[1]=32;
		d[2]=33;
		d[3]=34;
		System.out.println(a[2]);
		System.out.println(b[2]);
		System.out.println(c[2]);
		System.out.println(d[2]);
		System.out.println(a.length);
		//length --> here length is not a method here length used as a keyword
		//Because () not present in front of length keyword
	}

}
