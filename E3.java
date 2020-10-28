import java.util.Scanner;

public class E3
{
	public static void main (String [] nilaiTerima)
	{
		//Part 4
		int noInt = 10;
		char saya = 'a';
		char saya2 = 53; //ascii code
		final char SAYA3 = 55; //constant //search bout final static
		
		System.out.println("Nombor int "+noInt);
		System.out.println("Char "+saya);
		System.out.println("Char 2 "+saya2);
		System.out.println("Char 3 "+SAYA3);


		int[] arrayInt = new int[4];
		for(int i=0;i<arrayInt.length;i++)
		{
			System.out.println(arrayInt[i]);
		}


		//Part 5
		int[] tataInt = {10,20,30,40};
		for(int i=0;i<tataInt.length;i++)
		{
			System.out.println(tataInt[i]);
		}

		//for-each or advanced for
		for(int t : tataInt)
		{
			System.out.println("for each: " + t);
		}
	}
}