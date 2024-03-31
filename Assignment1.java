/*Write a program to calculate percentage of a given student in CBSE board exam.
His marks of 5 subjects must be taken as input from keyboard(Marks are out of 100)*/

import java.util.Scanner;
public class Assignment1 {
	public static void main(String[]args) {
		
		/*
		 * int math,phy,chem,bio,eng; float per;
		 */
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks of Math");
		float math=sc.nextFloat();
		
		System.out.println("Enter marks of Physics");
		float phy=sc.nextFloat();
		
		System.out.println("Enter marks of Chemistry");
		float chem=sc.nextFloat();
		
		System.out.println("Enter marks of Biology");
		float bio=sc.nextFloat();
		
		System.out.println("Enter marks of English");
		float eng=sc.nextFloat();
		
		float per =(math+phy+bio+chem+eng)/5;
		System.out.println("Your percentage is : "+per);
		
		
	}

}
