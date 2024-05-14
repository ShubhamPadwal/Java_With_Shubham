// Write a java program to find Palindrome String
package InterviewQuestions;
import java.util.*;
public class PalindromeString {

	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Write any String");
		String str=sc.nextLine();
		String s="";
		for(int i=str.length()-1;i>=0;i--) // Reverse the string
		{
			char ch=str.charAt(i);
			s=s+ch; // Store characters in String s
		}
		System.out.println(s);
		if(str.equals(s)) {
			System.out.println(str+" is Palindrome String");
		}else {
			System.out.println(str+" is not Palindrome");
		}
	}
}
