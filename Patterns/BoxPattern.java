// WAP to print box pattern

package Patterns;
import java.util.*;
public class BoxPattern {

	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows");
		int rows=sc.nextInt();
		
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=rows;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
