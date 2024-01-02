package Java;

public class Simple{
	public static void main(String[]args) {
		String location = "Kharadi";
		int size = 2;
		int price = 90;
		
		if (location == "Kharadi") 
		{
			System.out.println("We have correct location");
			if (size==2) 
			{
				System.out.println("Yes we want the same");
				if (price<=80) 
				{
					System.out.println("Lets check the flat");
				}
				else 
				{
					System.out.println("But it is out of my budget");
					
				}
			}
				else 
				{
					System.out.println("I dont want this size");
				}
			}
			else {
				System.out.println("I dont want this location");
			}
		}
	}


