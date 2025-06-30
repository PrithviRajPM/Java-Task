package Array;

import java.util.Scanner;

public class ArrayOfObjects {
	String name;
	int id;
	ArrayOfObjects(String name, int id){
		this.name=name;
		this.id=id;
	}
	public void print() {
System.out.println("Name: "+name);
System.out.println("Id: "+id);
	}
	public void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayOfObjects[] arr1=new ArrayOfObjects[3];//int[] a=new int[]
		System.out.println("Enter 3 member's name and Id");
		for(int i=0;i<3;i++) {
			System.out.println("Enter the details of member "+(i+1));
			arr1[i]=new ArrayOfObjects(sc.next(),sc.nextInt());
		}
for(ArrayOfObjects details:arr1) {
	details.print();
}
//for(int num:arr1)
	}

}
