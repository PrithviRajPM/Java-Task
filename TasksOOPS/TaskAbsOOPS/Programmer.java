package TasksOOPS.TaskAbsOOPS;

public class Programmer extends Employee {
	Programmer(int id,String name,String designation,int sal){
		super.id=id;
		super.name=name;
		super.designation=designation;
		super.salary=sal;
	}

public void DisplayInfo() {
	System.out.println("Id: "+id);
	System.out.println("Name: "+name);
	System.out.println("Designation: "+designation);
}
public void CalculateSalary() {
	System.out.println("Salary: "+salary);
}
}
