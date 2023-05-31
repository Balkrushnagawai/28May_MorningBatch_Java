package string;

public class Methods_Of_String {
	public static void main(String[] args) {
		String rekha="Dream Girl";
		String hema ="dream girl";
		String jaya = new String("Dream Girl");
		String susma =new String("Home Minister");
		//.equals() --> equals() method is use for compare the data between two  string
		//Return type --> boolean
		boolean result =rekha.equals(hema);
		boolean result1 = rekha.equals(jaya);
		System.out.println(result);
		System.out.println(result1);
		System.out.println("---------->");
		
		//.equalsIgnoranceCase() --> This method is used to check character to character 
		//Doesn't matter character is capital or small
		//Return type --> boolean
		boolean result2 =rekha.equalsIgnoreCase(hema);
		System.out.println(result2);
		System.out.println("---------->");
		
		//.toUpperCase() --> this method is use to convert String to UpperCase
		//Return type --> String
		String result3 =hema.toUpperCase();
		System.out.println(result3);
		System.out.println("---------->");
		
		//.toLowerCase() --> this method is use to convert String to UpperCase
		//Return type --> String
		String result4 =susma.toLowerCase();
		System.out.println(result4);
		System.out.println("---------->");
		
		//.concat() --> this method is used to add another string in front of mentioned string
		//Return type --> String
		String result5 =susma.concat(" is love of india");
		System.out.println(result5);
		System.out.println("---------->");
		
		//length() --> length method is used to count the the character of the string
		//Return type --> int
		int result6 =susma.length();
		System.out.println(result6);
		System.out.println("---------->");
		
		//charAt() --> this method is use to show character present on index number in given string
		//Return type --> char
		char return7 =hema.charAt(4);
		System.out.println(return7);
		System.out.println("---------->");
		
		//indexOf() --> this method is used to show first index of repeted string character
		//present in the given string
		int result8 =jaya.indexOf("r");
		System.out.println(result8);
		System.out.println("---------->");
	}

}
