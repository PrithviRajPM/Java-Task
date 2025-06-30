package TasksOOPS.OOPS;

import java.util.Scanner;

public class ConstructorOL {
	 int id;
	 String name;
	 String location;
	ConstructorOL(int id){
		this.id=id;}
	ConstructorOL(int id,String name){
		this.id=id;
		this.name=name;
	}
	ConstructorOL(int id,String name, String location){
		this.id=id;
		this.name=name;
		this.location=location;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Id");
	ConstructorOL c=new ConstructorOL(sc.nextInt());
	System.out.println("Id, Name");
	ConstructorOL c1=new ConstructorOL(sc.nextInt(),sc.next());
	System.out.println("Id, Name, Location");
	ConstructorOL c2=new ConstructorOL(sc.nextInt(),sc.next(),sc.next());
	System.out.println("Employee's Id: "+c.id);
	System.out.println("Employee's Name: "+c1.name);
	System.out.println("Employee's Location: "+c2.location);
	}

}
