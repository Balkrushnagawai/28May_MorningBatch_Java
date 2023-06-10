package logical_Program1;

import java.util.Arrays;

public class B_CompareTwo_int_Array {
	public static void main(String[] args) {
		//dataType ArrayName[]={data};
		//dataType[] ArrayName={data};
		//dataType ArrayName[]=new datatype[numberOfdata];
		//dataType[] ArrayName=new datatype[numberOfdata];
		int[] anay= {01,02,03,04,05};
		int[] mangesh={01,02,03,04,05};
		int vinay[]= {11,12,13,14,15};
		int[] sanjay= new int[5];
		int vinod[]=new int[5];
		sanjay[0]=01;
		sanjay[1]=02;
		sanjay[2]=03;
		sanjay[3]=04;
		sanjay[4]=05;
		vinod[0]=31;
		vinod[1]=32;
		vinod[2]=33;
		vinod[3]=34;
		vinod[4]=35;
		System.out.println(Arrays.equals(anay, mangesh));
		System.out.println(Arrays.equals(anay, vinay));
		System.out.println(Arrays.equals(anay, sanjay));
		System.out.println(Arrays.equals(anay, vinod));
		//System.out.println(anay.equals(mangesh));
		//System.out.println(anay.equals(vinod));
		//System.out.println(anay.equals(sanjay));
		//System.out.println(anay.equals(vinay));
	}

}
