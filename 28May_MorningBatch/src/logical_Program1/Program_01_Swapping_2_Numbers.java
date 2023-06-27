package logical_Program1;

public class Program_01_Swapping_2_Numbers {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		
		System.out.println("Before swapping a and b values are "+a+"and "+b);
		//Logic 1-- Using 3rd Variable
		int t=a;
		a=b;
		b=t;
		System.out.println("After swapping a and b values are "+a+" & "+b);
		
		//Logic 2 -- use -&+ without using 3rd variable
		int e=10;
		int f=20;
		System.out.println("Before swapping a and b values are "+e+"and "+f);
		e=e+f;
		f=e-f;
		e=e-f;
		System.out.println("After swapping a and b values are "+e+" & "+f);
		
		//Logic 3-- use * & /
		
		int i=10;
		int j=20;
		System.out.println("Before swapping a and b values are "+i+"and "+j);
		i=i*j;
		j=i/j;
		i=i/j;
		System.out.println("After swapping a and b values are "+i+" & "+j);
		
		//Logic 4 --Bitwize XOR
		
		//Logic 5 -- Single Statement
		int m=10;
		int n=20;
		System.out.println("Before swapping a and b values are "+m+"and "+n);
		n=m+n-(m=n);
		System.out.println("After swapping a and b values are "+m+" & "+n);
	}

}
