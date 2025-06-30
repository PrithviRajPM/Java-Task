package TasksOOPS.TaskAbsOOPS;

import java.util.Scanner;

public class Display {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Programmer p=new Programmer(sc.nextInt(),sc.next(),sc.next(),sc.nextInt());
		Manager m=new Manager(sc.nextInt(),sc.next(),sc.next(),sc.nextInt());
System.out.println("Enter 1 to display Programmer's detail");
System.out.println("Enter 1 to display Managers's detail");
int input=sc.nextInt();
switch(input) {
case 1:{
	p.DisplayInfo();
	p.CalculateSalary();
}break;
case 2:{
	m.DisplayInfo();
	m.CalculateSalary();
}
}

	}

}
