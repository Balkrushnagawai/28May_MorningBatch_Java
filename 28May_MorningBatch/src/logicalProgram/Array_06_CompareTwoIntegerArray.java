package logicalProgram;

import java.util.Arrays;

public class Array_06_CompareTwoIntegerArray {
	public static void main(String[] args) {
		int array1[] = {10,11,12,13,14,15};
		int array2[] = {21,13,12,32,12,19};
		int array3[] = {21,13,12,32,12,19};
		
		//compare array1 and array2
		System.out.println(Arrays.equals(array1, array2));
		
		//compare array2 and array3
		System.out.println(Arrays.equals(array2,array3));
		
		//compare array1 and array3
		System.out.println(Arrays.equals(array1,array3));
	}

}
