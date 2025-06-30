package TasksOOPS.PolyOOPS;

import java.util.Scanner;

public class Mol {

public void Overload(int id, String name) {
	System.out.println("ID: "+id);
	System.out.println("NAME: "+name);
}
public void Overload(String location, int age) {
	System.out.println("AGE: "+age);
	System.out.println("LOCATION: "+location);
}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
Mol obj=new Mol();
System.out.println("Enter employee's id & name: ");
obj.Overload(in.nextInt(), in.next());
System.out.println("Enter employee's location & age: ");
obj.Overload(in.next(), in.nextInt());
	}

}
