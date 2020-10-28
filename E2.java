public class E2
{
	public static void main (String [] nilaiTerima)
	{
		//Part 2
		int noInt = 123;
		int noInt2 = 345;
		double noDouble = 123.456;

		System.out.format("%d",noInt);
		System.out.format("\n%6d",noInt); 
		System.out.printf("\n%6d %4d",noInt,noInt2);
		System.out.format("\n%4d",noInt2);
		System.out.format("\nRM%7.1f",noDouble);
		System.out.printf("\n%7.3f %6d",noDouble,noInt);


		//Part3
		int sum=0;
		for(int i=0;i<nilaiTerima.length;i++)
		{
			System.out.println("\nNilai:" + nilaiTerima[i]);
			// sum+=nilaiTerima[i]; //error 

			 //correct convert string to int
			sum+=Integer.parseInt(nilaiTerima[i]);
			System.out.println("Nilai sum:" + sum);
		} 
		//java E21 10 20 30 40
	}
}