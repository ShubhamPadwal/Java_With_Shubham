import java.util.*;
public class Food_Order_System extends Food_Menu {
	
	public static void main(String[]args) {
		Food_Order_System.menu();
		Scanner sc =new Scanner(System.in);
		int value=0;
		while(true) {
			System.out.println("..................................................................");
			System.out.println("Please Select Your Pizza");
			int choice =sc.nextInt(); // Stores input(choice of user) 
		switch(choice) {
		case 1:value=value+145;
		break;
		
		case 2:value=value+120;
		break;
		
		case 3:value=value+135;
		break;
		
		case 4:value=value+125;
		break;
		
		case 5:value=value+140;
		break;
		
		case 6:value=value+120;
		break;
		
		case 7:value=value+135;
		break;
		
		case 8:value=value+135;
		break;
		
		case 9:value=value+169;
		break;
		
		case 10:value=value+149;
		break;
		
		case 11:value=value+119;
		break;
		
		case 12:value=value+145;
		break;
		
		default:
            System.out.println("Please enter a valid choice.");
            continue;
		}

		while(true) {
		System.out.println("Want to add something ? ");
		System.out.println("Press 1 to reorder");
		System.out.println("Press 2 to exit");
		int reorder=sc.nextInt();
		if(reorder==1) {
			Food_Order_System.menu();
			break;  // Breaks the inner loop
		}
		else if(reorder==2) {
			System.out.println("Your Order Value is "+value+" Rs");
			System.out.println("Thank You! Visit Again...");
		//  break;
			System.exit(0);  // Exit the code. Successful termination
		}
		else {
			System.out.println("Please enter Valid Choice");
		}
		}
		}
					
	}

}
