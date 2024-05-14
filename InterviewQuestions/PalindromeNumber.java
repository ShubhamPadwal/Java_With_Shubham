// Write a java program to find palindrome number

package InterviewQuestions;
import java.util.*;
public class PalindromeNumber {

	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Write any number");
		int num=sc.nextInt();
		int remainder,sum=0;
		int temp=num;
		
		while(num>0) {
			remainder=num%10; // it gives us remainder  101 % 10 = 1
			sum=(sum*10)+remainder; // 0*10+1
			num=num/10; // 101 / 10 =10
		}
		if(temp==sum) {
			System.out.println(temp+" is Palindrome");
		}else {
			System.out.println(temp+" is not Palindrome");
		}
	}
}
