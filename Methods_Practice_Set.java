
import java.util.*;
public class Methods_Practice_Set {
	
	// 1] Write a java method to print an table of a number n
	
	public static void table(int x) {
		
		for(int i=1;i<=10;i++) {
			System.out.println(x+" x "+i+" = "+x*i);
		}
	}
	
	// 2] WAP to print the following pattern using method
	/*  *
	    * *
	    * * *
	    * * * *
	 */
	
	public static void pattern(int x) {
		for(int i=1;i<=x;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	// 3] write a recursive function to calculate the sum of first n natural numbers
	
	public static int sum(int x) {
		if(x==1) {
			return 1;
		}
		else {
			return x+sum(x-1);
		}
	}
	
	// 4] WAP to print the n th term of fibonacci series
	
	public static int fibonacci(int i) {
		/*
		 * if(i==1) {
		 *  return 0;
		 *  } 
		 * else if(i==2) {
		 *  return 1;
		 *  }
		 */
		if(i==1 || i==2) {
			return i-1;
		}
		else {
			return fibonacci(i-1)+fibonacci(i-2);
		}
	}
	
	public static void main(String[]args) {
		table(4);
		pattern(5);
		int c=sum(5);
		System.out.println("Sum is :"+c);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		System.out.println(n+" th term of fibonacci series is "+fibonacci(n));
		
	}

}
