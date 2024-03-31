
import java.util.*;
public class CWH_Practice_Set_1 {

	public static void main(String[]args) {
		
		//Write a program to sum three numbers in java
		int a=10;
		int b=15;
		int c=20;
		int sum=a+b+c;
		System.out.println("The sum is : "+sum);
		
		//Write a program which ask the user to enter his/her name and prints 
		//"Hello <name>,have a good day ..."
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name :");
		String user=sc.nextLine();
		System.out.println("Hello "+user+", have a good day ...");
		
		
		//Write a program to convert Kilometers to miles
		
		System.out.println("Enter kilometers :");
		float km=sc.nextFloat();
		float miles=0.621371f*km;
		System.out.println(miles);
		
		//Write a program to detect whether a number enterd by user is is integer or not
		
		System.out.println("Enter any number");
		System.out.println(sc.hasNextInt());
		
}
}
