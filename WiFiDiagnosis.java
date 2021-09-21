package WiFiDiagnosis;
import java.util.Scanner;

public class WiFiDiagnosis {

	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner enter = new Scanner(System.in);
		for(int i=1;i<=5;i++)
		{
			
			switch(i) 
			{
			case 1:
				System.out.println("reboot your computer");
				System.out.println("Are you able to connect with the internet? (yes or no)");
				String enter1 = enter.nextLine();
					if(enter1.matches("yes"))
						{
						i=6;
						}
				break;
			case 2:
				System.out.println("reboot your router");
				System.out.println("Now are you able to connect with the internet? (yes or no)");
				enter1 = enter.nextLine();
				if(enter1.matches("yes"))
					{
					i=6;
					}
				break;
			case 3:
				System.out.println("make sure the cables to your router are plugged in firmly and your router is getting power");
				System.out.println("Now are you able to connect with the internet? (yes or no)");
				enter1 = enter.nextLine();
				
				if(enter1.contains("yes"))
					{
					i=6;
					}
				break;
			case 4:
				System.out.println("move your computer closer to your router");
				System.out.println("Now are you able to connect with the internet? (yes or no)");
				enter1 = enter.nextLine();
				
				if(enter1.matches("yes"))
					{
					i=6;
					}
				break;
			case 5:
				System.out.println("contact your ISP");
				System.out.println("Make sure your ISP is hooked up to your router.");
				break;
					
		
			}
		}

	}

}
