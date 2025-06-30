package Array;

import java.util.Scanner;

public class FindingElement {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int s1=in.nextInt();
		int[] a=new int[s1];
		for(int i=0;i<a.length;i++) {
			a[i]=in.nextInt();
		}
		int key=10;
		boolean val=false;
for(int i=0;i<a.length;i++) {
	if(a[i]==key && val==false) {
		val=true;
	}
	
}
if(val==true) {
	System.out.println("Element "+key +" is found!");
	}
else{
	System.out.println("Element "+key +" is not found!");
	}
in.close();
	}

}
