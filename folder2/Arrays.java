package Basics;

public class Arrays {
	
	public static void main(String[] args) {
		
		
//		Single Dimensional Array
		
//		Declaration of an Array
		
//		int a[]=new int [6];
		
//		Add the values in the Array
		
//		a[0]=16;
//		a[1]=40;
//		a[2]=59;
//		a[3]=22;
//		a[4]=67;
//		a[5]=89;
		
//		To check Size/Capacity/Length of Array
		
//		System.out.println("Length of Array is:" + a.length);
		
//		How to Read the all values in the Array
		
//		for(int i=0;i<a.length;i++)
//		System.out.println(a[i]);
		
		
//		How to add Multiple values in single line
		
//		int ar[]= {100,200,300,400,500};
//		for(int i=0;i<ar.length;i++) {
//			System.out.println(ar[i]);
//		}
		
		
		
//		Multidimensional Arrays
		
//		Array Declaration
		int a[][]=new int[3][2];
		
		
//		Inserting the Values
		a[0][0]=50;
		a[0][1]=100;
		a[1][0]=150;
		a[1][1]=200;
		a[2][0]=250;
		a[2][1]=300;
		
//		Size of an array
		System.out.println("The Number of Rows are:"+ a.length);
		System.out.println("The Number of Columns are:"+ a[0].length);
		
		
	}
}
