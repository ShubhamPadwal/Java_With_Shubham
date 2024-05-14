package Patterns;

import java.util.Scanner;

public class Even_Num_Sum {
	
	public static void main(String[]args) {

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
	}
	
}
