package TasksOOPS.encapOOPS;

import java.util.Scanner;

public class EncapTask {
	private int id;
	private String name;
	private String location;
	
	EncapTask(int id, String name, String location){
		this.id=id;
		this.name=name;
		this.location=location;
	}
	public String getName() {
		return name;
	}
	public int getID() {
		return id;
	}
	public String getLocation() {
		return location;
	}
	public void setDetails(int id, String name, String location) {
		this.id=id;
		this.name=name;
		this.location=location;
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("----- Getter method -----");
		EncapTask e1=new EncapTask(sc.nextInt(), sc.next(), sc.next());
		System.out.println("Id: "+e1.getID());
		System.out.println("Name: "+e1.getName());
		System.out.println("Location: "+e1.getLocation());
		System.out.println("----- Setter method -----");
		e1.setDetails(sc.nextInt(), sc.next(), sc.next());
		System.out.println("Id: "+e1.getID());
		System.out.println("Name: "+e1.getName());
		System.out.println("Location: "+e1.getLocation());
	}

}
