// WAP to print reverse triangle

package Patterns;
import java.util.*;
public class ReverseTriangle {

	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of Rows: ");
		int rows=sc.nextInt();
		
		for(int i=1;i<=rows;i++) { // Iterates 1 to rows
			
			for(int j=1;j<=i;j++) { // Prints space in increasing order
				System.out.print(" ");
			}
			
			for(int k=rows;k>=i;k--) { // Prints "*" in decreasing order
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
