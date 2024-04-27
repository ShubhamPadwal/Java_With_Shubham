// WAP to print Diamond Pattern

package Patterns;
import java.util.Scanner;
public class Diamond {

	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows : ");
		int rows=sc.nextInt();
		
		for(int i=1;i<=rows/2;i++) {// Iterates 1 to rows/2
			
			for(int j=rows/2;j>=i;j--) { // Prints space
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) { // prints star
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int i=1;i<=rows/2;i++) {// Iterates 1 to rows/2
			
			for(int j=1;j<=i;j++) { // Prints space
				System.out.print(" ");
			}
			for(int k=rows/2;k>=i;k--) { // prints star
				System.out.print("* ");
			}
			System.out.println();
		}
		
			
	}
}
