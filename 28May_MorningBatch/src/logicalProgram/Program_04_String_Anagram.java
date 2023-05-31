package logicalProgram;

import java.util.Arrays;

public class Program_04_String_Anagram {
	public static void main(String[] args) {
		//Anagram String
		String a= "Horse";
		String b="Shore";
		//1.lower Case
		//2.String to Array
		//3.sort-->a sort-->b
		//4.Compare --->true-->Anagram
		char[] arrayof_a = a.toLowerCase().toCharArray();
		char[] arrayof_b = b.toLowerCase().toCharArray();
		Arrays.sort(arrayof_a);
		Arrays.sort(arrayof_b);
		if(Arrays.equals(arrayof_a, arrayof_b))
		{
			System.out.println("String "+a+ " and String "+b+ " are Anagram");
		}
		else
		{
			System.out.println("String "+a+ " and String "+b+ " are Not Anagram");
		}
	}
	
	

}
