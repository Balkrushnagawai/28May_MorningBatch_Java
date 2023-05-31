package logicalProgram;

public class Program_08_Find_Occurance_Of_Chracter {
	public static void main(String[] args) {
		//count number of particular string
		//Find Occurrence of character o
		String s="AkshayBhosale";
		String s1 = s.toLowerCase();
		int count=0;
		for(int i=0; i<=s1.length()-1; i++)
		{
			char c=s1.charAt(i);
			if(c=='a')
			{
				count++;
			}
		}
		System.out.println(count);
	}
}
/*//count number of particular string
		//Find Occurrence of character o
		int counter=0;
		String s="Follower";
		for(int i=0; i<=s.length()-1; i++)
		{
			char x = s.charAt(i);
			if(x=='o')
			{
				counter++;
			}
		}
		System.out.println(counter);
	}*/
