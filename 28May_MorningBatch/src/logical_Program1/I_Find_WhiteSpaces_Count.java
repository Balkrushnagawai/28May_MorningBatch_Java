package logical_Program1;

public class I_Find_WhiteSpaces_Count {
	public static void main(String[] args) {
		String name = " V E L O C I T Y ";
		int count=0;
		for(int i=0; i<=name.length()-1; i++)
		{
			char value = name.charAt(i);
			if(value==' ')
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
