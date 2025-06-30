package Array;

import java.util.Scanner;

public class LAngledTriArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner( System.in);
		int rows=sc.nextInt();
char[][] a=new char[rows][];
for(int i=0;i<rows;i++) {
	a[i]=new char[i+1];
}
for(int i=0;i<rows;i++) {
	for(int k=0;k<=rows-i-1;k++) {
		System.out.print(" ");
	}
	for(int j=0;j<a[i].length;j++) {
		System.out.print('*');
	}
	System.out.println();
}
	}

}
