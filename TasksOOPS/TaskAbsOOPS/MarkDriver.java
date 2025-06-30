package TasksOOPS.TaskAbsOOPS;

import java.util.Scanner;

public class MarkDriver {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter student A's marks: ");
		A a=new A(sc.nextInt(),sc.nextInt(),sc.nextInt());
		System.out.println("Enter student B's marks: ");
		B b=new B(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt());
		System.out.println("Enter 1 to display student A's marks");
		System.out.println("Enter 2 to display student B's marks");
		int choice=sc.nextInt();
		switch(choice) {
		case 1->System.out.println("Student A's percentage is "+a.getPercent());
		case 2->System.out.println("Student B's percentage is "+b.getPercent());
		}
	}

}
