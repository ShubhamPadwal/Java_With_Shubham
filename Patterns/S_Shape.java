package Patterns;

public class S_Shape {

	public static void main(String[]args) {

		System.out.println("Enter number of rows:");
		int row=8;
		int col=8;
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=col;j++) {
				if(i==1 || i==4 || i==7 || j==1 && i<=4 ||j==8 && i>=4 && i!=8) {
				System.out.print("*");
				}
				else {
					System.out.print(" ");					
				}
			}	
			System.out.println();
		}
	}
}
