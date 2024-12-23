package Arrays;

public class Programs {

	public static void main(String[] args) {
		
//		EvenOdd
		
//		int[] a= {2,3,5,7,4,9,8};
//		
//		System.out.println("Even Number are: ");
//		
//		for(int i=0;i<a.length;i++) {
//			if(a[i]%2==0) {
//				System.out.print(a[i] +" ");
//			}
//		}
//		System.out.println();
//		System.out.println("Odd Numbers are: ");
//		
//		for(int i=0;i<a.length;i++) {
//			if(a[i]%2!=0) {
//			System.out.print(a[i] +" ");
//		}
//	}
		
		
//	MaxMin
		
//		int[] a= {10,60,30,20,90,50};
//		int max=a[0];
//		
//		for(int i=0;i<a.length;i++) {
//			
//			if(a[i]>max) {
//				max=a[i];
//				
//			}
//		}
//		System.out.println("Maximum Element is: "+max);
//		
//		int min=a[0];
//		
//		for(int i=0;i<a.length;i++) {
//			
//			if(a[i]<min) {
//				min=a[i];
//				
//			}
//		}
//		System.out.println("Minimum Element is: "+min);
		
		
		
//		Duplicate Element In Array
		
//		int[] a= {10,30,80,20,10,50};
//		
//		boolean flag=false;
//		
//		for(int i=0;i<a.length;i++) {
//			for(int j=i+1;j<a.length;j++){
//				if(a[i]==a[j]) {
//					System.out.println("Duplicate Element is: "+a[i]);
//					flag=true;
//					
//				}
//			}
//		}
//		
//		if(flag==false) {
//			System.out.println("Duplicate Element Not Found");
//		}
		
		
		
		   
       int[] a= {10,20,50,30,90,70};
		
		int max=a[0];
		
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
				
				
			}
		}
		
		System.out.println("Maximum Element is: "+max);
		
        int min=a[0];
		
		for(int i=0;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
				
		
			}	
		
			}	
		System.out.println("Minimum Element is: "+min);
		
}
}