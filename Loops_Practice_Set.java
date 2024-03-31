import java.util.*;
public class Loops_Practice_Set {
	
	public static void main(String[]args) {

	/* 1] Write a program to print
       * * * *
       * * *
       * *
       *           
       *           */
	
	for(int i=4;i>=1;i--) {
		for(int j=i;j>=1;j--) {
			System.out.print("* ");
		}
		System.out.println();
	}
	
	//2] WAP to sum first n even numbers using while loop
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter value of n");
	int n=sc.nextInt();
	int i=1;
	int sum=0;
	while(i<=n) {
		if(i%2==0) {
			 sum=sum+i;
		}
		i++;
	}
	System.out.println("Your sum is "+sum);
	
	
//	3]WAP to print the table of given number
	System.out.println("Enter number to print table");
	int num=sc.nextInt();
	
	for(int t=1;t<=10;t++) {
		int result=t*num;
		System.out.println(num+"*"+t+"="+result);
	}
	
//  4]WAP to find the factorial of given number using for loop
	
	System.out.println("Enter any number");
	int fact=sc.nextInt();
	int Factorial =1;
	int m=1;
	for(m=1;m<=fact;m++) {
		Factorial =Factorial*m;
	}
	System.out.println("Factorial is :"+Factorial);
	
//  4]WAP to find the factorial of given number using while loop
	System.out.println("Enter any number");
	int facto=sc.nextInt();
	while(m<=facto) {
		Factorial=Factorial*m;
		m++;
	}
	System.out.println("Factorial is :"+Factorial);
	}	

}
