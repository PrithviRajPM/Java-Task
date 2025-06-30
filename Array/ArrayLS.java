package Array;

import java.util.Scanner;

public class ArrayLS {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] a=new int[6];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		int largest=0;
		int smallest=a[0];
		for(int j=0;j<a.length;j++) {
			if(a[j]>largest) {
				largest=a[j];
			}
			if (a[j]<smallest) {
				smallest=a[j];
			}
			
		}
		System.out.println("The largest element in the array is "+largest);
		System.out.println("The smallest element in the array is "+smallest);
		
	}

}
