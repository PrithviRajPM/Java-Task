package Array;

import java.util.Scanner;

public class AvgOfArray {

	public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
 System.out.print("Enter the size of the array: ");
 int size=sc.nextInt();
 System.out.println("Size of the array is "+size);
	int[] a=new int[size];
	for(int i=0;i<a.length;i++) {
		System.out.print("Enter the "+i+"th element of the array ");
		a[i]=sc.nextInt();
	}
	double average=Average(a,size);
System.out.println("The average of elements is "+average);
	}
	
	public static double Average(int[] a, int size) {
		int sum=0;
		double avg=0;
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
		}
		avg=(double)sum/a.length;
		return avg;
	}

}
