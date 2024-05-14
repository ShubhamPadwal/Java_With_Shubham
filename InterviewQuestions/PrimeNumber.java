// Write a Java Program to take an number as a input from user and find is it prime number or not

package InterviewQuestions;
import java.util.*;
public class PrimeNumber {

	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int num=sc.nextInt();
		int count=0;
		for(int i=1;i<=num;i++) // Loop will iterate from 1 to num
		{
			if(num%i==0) // if num is fully divisible by i then increment the count
			{
				count++;
			}
		}
		if(count==2) // Prime Number means number is divisible by 1 and itself
		{
			System.out.println(num+" is an Prime Number");
		}else {
			System.out.println(num+" is not Prime Number");
		}
	}
}
