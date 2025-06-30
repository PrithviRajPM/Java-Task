package TasksOOPS.encapOOPS;

import java.util.Scanner;

public class ConstructorTask {
int id;
String name;
String location;
float salary;
	public ConstructorTask(int b, String a, String l, float s) {
		id=b;
		name=a;
		location=l;
		salary=s;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st employee details: ");
		ConstructorTask o1=new ConstructorTask(sc.nextInt(), sc.next(), sc.next(), sc.nextFloat());
		o1.Details();
		System.out.println("Enter 2nd employee details: ");
		ConstructorTask o2=new ConstructorTask(sc.nextInt(), sc.next(), sc.next(), sc.nextFloat());
		o2.Details();
		System.out.println("Enter 3rd employee details: ");
		ConstructorTask o3=new ConstructorTask(sc.nextInt(), sc.next(), sc.next(), sc.nextFloat());
		o3.Details();
		System.out.println("Enter 4th employee details: ");
		ConstructorTask o4=new ConstructorTask(sc.nextInt(), sc.next(), sc.next(), sc.nextFloat());
		o4.Details();
		System.out.println("Enter 5th employee details: ");
		ConstructorTask o5=new ConstructorTask(sc.nextInt(), sc.next(), sc.next(), sc.nextFloat());
		o5.Details();
		
	}
public void Details() {
	System.out.println("Id: "+id);
	System.out.println("Name: "+name);
	System.out.println("Location: "+location);
	System.out.println("Salary: "+salary);
}
}
