package Java;

public class primeornot {
	public static void main(String[]args) {
		int a=3;
		int count=0;
		
		for(int i=2; i<a; i++)
		{
			if (a%i ==0) 
			{
				count++;
			}
		}
		if (count ==0) 
		{
			System.out.println("Number is prime");
		}
		else {
			System.out.println("Not a prime number");
		}
		
	}

}
