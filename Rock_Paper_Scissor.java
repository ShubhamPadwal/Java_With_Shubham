import java.util.*;
public class Rock_Paper_Scissor {

	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println();
			System.out.println("Want to Play Game");
			System.out.println("Press 1 for play \nPress 2 for exit");
			int i=sc.nextInt();
			
			if(i!=1) {
				System.out.println("Thank you for your time...");
				break;
			}
		System.out.println("Press 1 for Rock");
		System.out.println("Press 2 for Paper");
		System.out.println("Press 3 for Scissor");
		System.out.print("Your Choice :");
		
		int input=sc.nextInt();
		Random num=new Random();
		int Rnum=num.nextInt(3)+1;
		System.out.println("Computer Choice :"+Rnum);
		
		if(input==1 && Rnum==1) {
			System.out.println("___Match Tie___");		
		}
		
		else if(input==1 && Rnum==2) {
			System.out.println("___Opponent Win____");		
		}
		
		else if(input==1 && Rnum==3) {
			System.out.println("___You win___");		
		}
		
		else if(input==2 && Rnum==1) {
			System.out.println("___You Win___");		
		}
		
		else if(input==2 && Rnum==2) {
			System.out.println("___Match Tie___");		
		}
		
		else if(input==2 && Rnum==3) {
			System.out.println("___Opponent Win___");	
		}
		
		else if(input==3 && Rnum==1) {
			System.out.println("___Opponent Win___");		
		}
		
		else if(input==3 && Rnum==2) {
			System.out.println("___You Win___");		
		}
		
		else if(input==3 && Rnum==3) {
			System.out.println("___Match Tie__");		
		}
		else {
			System.out.println("Enter valid input");
		}
	}
	}
	
}
