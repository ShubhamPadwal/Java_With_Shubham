
// WAP to print factorial of number using recursion
import java.util.*;
public class Recursion {
	
	public static int factorial(int n) {
		if(n==0 || n==1) {
			return 1;
		}
		else {
			return n * factorial(n-1);
		}
	}
	
	public static void main(String[]args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number : ");
		int x=sc.nextInt();
		System.out.println("Factorial of "+x+" is "+factorial(x));
		
		//Iterative approach
		int factorial=1;
		for(int i=x;i>=1;i--) {
			factorial=factorial*i;
		}
		System.out.println("Factorial is "+factorial);
	}
	

}
