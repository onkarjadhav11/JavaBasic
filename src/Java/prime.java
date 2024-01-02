package Java;

public class prime {
	public static void main(String [] args) {
		int a=23;
		
		int count=0;
		
		for(int i=2; i<a; i++)
		{
			if (a%i == 0) 
			{
			count++;	
			}
		}
		if (count == 0) 
		{
			System.out.println("number is prime");
		}
		else 
		{
			System.out.println("number is composite");
		}
	}

}
