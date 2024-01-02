package Java;

public class LadderElseIf {
	public static void main(String [] args) {
		int a=600;
		int b=800;
		int c=800;
		
		if (a==b && b==c)
		{
			System.out.println("All numbers are equal");
		
		}
		else if (a>b) 
		{
			if (a>c) 
			{
				System.out.println("a is greater");
			}
		}
		else if (b>c)
		{
			System.out.println("b is greater");
		}
		else
		{
			System.out.println("c is greater");
		}
	}

}
