package Array;

import java.util.Scanner;

public class Replacing {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] a= {1,2,3,4,5};
		int target=4;
		int replacement=9;
		for(int i=0;i<a.length;i++) {
			if (a[i]==target) {
				a[i]=replacement;
			}
		}
	for(int num:a) {System.out.println(num);}
	}
	

}
