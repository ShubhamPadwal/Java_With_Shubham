
public class Array {
	
	public static void main(String[]args) {
		
		// 1] Create an array of 5 floats and calculate their sum
		float sum=0;
		float [] marks= {45.5f,78.5f,77.5f,69.5f,85.5f};
		for(float elements:marks) {
			sum=sum+elements;
		}
		System.out.println("Sum is "+sum);
		
		// 2] Write a program to find out whether a given number is preset in array or not
		
		float num=77.5f;
		boolean isPresent=false;
		float [] numbers= {45.5f,78.5f,77.5f,69.5f,85.5f};
		for(float elements:numbers) {
			if(elements==num) {
				isPresent=true;
				break;
			}
		}
		if(isPresent) {
			System.out.println("The number "+num+" is present in array");
		}
		else {
			System.out.println("The number "+num+" is not present in array");
		}
		
		// 3] Calculate the average marks from an array containing marks of physics of all students using for each loop
		
		float total=0;
		float [] physics= {55.8f,47.5f,44.0f,74.2f,85.0f,48.5f};
		for(float elements:physics) {
			total=total+elements;
		}
		System.out.println("Sum of all marks is "+total);
		float average=(float)(total/physics.length);
		System.out.println("The average of marks is "+total+" / "+physics.length+" = "+average);
		
		// 4] WAP to add two matrices of size 2x3
		
		int [][]mat1= {{1,2,3},{4,5,6}};
		int [][]mat2= {{9,8,7},{4,5,6}};
		int [][]result= {{0,0,0},{0,0,0}};
		
		for(int i=0;i<mat1.length;i++) { // row number of times
			for(int j=0;j<mat1[i].length;j++) { // column no. of times
				System.out.printf("Setting values for i=%d and j=%d \n",i,j);
				result[i][j]=mat1[i][j]+mat2[i][j];
			}
		}
		
		for(int i=0;i<mat1.length;i++) { // row number of times
			for(int j=0;j<mat1[i].length;j++) { // column no. of times
				System.out.print(result[i][j]+" ");
				// result[i][j]=mat1[i][j]+mat2[i][j];
			}
			System.out.println();
		}
	
		// 5] WAP to reverse an array
		//Let's use our marks array
		for(int i=marks.length-1;i>=0;i--) {
			System.out.println(marks[i]);
		}
		
		// 6] WAP to find the largest number of array
		
		int [] arr= {1,8,7,5,9,42,48,-57,-1,12,6,98,100,-581,457,58,4,125,36,7};
		int large=Integer.MIN_VALUE;
		for(int element:arr) {
			if(element>large) {
				large=element;
			}
		}
		System.out.println("The largest number of array is "+large);
		
		// 7] WAP to find the minimum number of an array 
		int min=Integer.MAX_VALUE;
		for(int element:arr) {
			if(element<min) {
				min=element;
			}
		}
		System.out.println("The smallest number of array is "+min);
		
		// 8] WAP to find an array is sorted or not
		
		boolean isSorted=true;
		int[] sort= {1,2,3,4,5,8,6,7,8,9,10};
		for(int i=0;i<sort.length-1;i++) {
			if(sort[i]>sort[i+1]) {
				isSorted=false;
				break;
			}
		}
		if(isSorted==true) {
			System.out.println("Array is sorted");
		}
		else {
			System.out.println("Array is not sorted");
		}
	}

}
