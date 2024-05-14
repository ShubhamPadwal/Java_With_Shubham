// Write a Java Program to Swap Numbers
package InterviewQuestions;
import java.util.*;
public class SwapNum {

	public static void main(String[]args){
		int num1=10;
		int num2=20;
		int temp=num1; // Store num1 in temporary variable
		num1=num2; // Store num2 in num1 variable
		num2=temp; // Store temp in num2 variable
		System.out.println("Num1 is "+num1);
		System.out.println("Num2 is "+num2);
	}
}
