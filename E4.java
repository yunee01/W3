import java.util.Scanner;

public class E4
{
	public static void main (String [] nilaiTerima)
	{
		//Part 6
		String name1,name2;
		int noInt;
		double noDouble;

		Scanner input = new Scanner(System.in);

		//user input for integer
		System.out.print("Enter a integer : ");
		noInt = input.nextInt();
		System.out.println("The integer is " + noInt );

		input.nextLine(); // avoid the nextLine below receive the "enter/string"

		//user input for name
		System.out.print("Enter first name : ");
		name1 = input.nextLine(); 
		//it will receive "enter" from previous user input
		//may cause next input unable to receive
		System.out.println("The first name is " + name1 );

		System.out.print("Enter second name : ");
		name2 = input.next(); 
		System.out.println("The second name is " + name2 );

		//user input for double
		System.out.print("Enter a double : ");
		noDouble = input.nextDouble();
		System.out.println("The double is " + noDouble );

		input.close();


		//Part 7
		int no1=10,x;

		if(no1==45)
			System.out.println("If else: Sama");
		else
			System.out.println("If else: Tak sama");

		//ternary op
		System.out.println(no1==10?"Ternary op: Sama":"Ternary op: Tak sama");

		x=(no1==10?3:19);

		System.out.println("Ternary op: Nilai x is "+ x);
	}
}