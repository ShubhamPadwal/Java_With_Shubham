// WAP letter "A" pattern

package Patterns;
public class Letter_A {

	public static void main(String[]args) {

		System.out.println("Enter number of rows:");
		int row=10;
		int col=20;
		int mid=10/2;
		int fl=col/2; //first line
		int sl=col/2; //second line
		
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=col;j++) {
				if(j==fl || j==sl || i==mid && j>fl && j<sl) {
				System.out.print("*");
				}
			    else {
				 System.out.print(" ");
			    }
			}	
			System.out.println();
			fl--;
			sl++;
		}
	}
}
