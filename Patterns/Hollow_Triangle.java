package Patterns;

public class Hollow_Triangle {

	public static void main(String[]args) {
		int fl=14/2;
		int sl=14/2;
		int base=7;
		
		for(int i=1;i<=10;i++) {
			for(int j=1;j<=13;j++) {
				if(j==fl || j==sl ||i==base) {
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
