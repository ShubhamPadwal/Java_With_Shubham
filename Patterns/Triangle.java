// WAP to print Triangle pattern

package Patterns;
import java.util.*;
public class Triangle {

	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows : ");
		int rows=sc.nextInt();
		
		for(int i=1;i<=rows;i++) {// Iterates 1 to rows
			
			for(int j=rows;j>=i;j--) { // Prints space
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) { // prints star
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
