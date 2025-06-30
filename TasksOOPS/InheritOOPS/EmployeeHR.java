package TasksOOPS.InheritOOPS;

public class EmployeeHR extends Employee {
	public void work() {
		System.out.println("After over-ride");
	   }
	public void addEmployee(){
//		super.getSalary();
		System.out.println("Add-salary");
	}
	
	public static void main(String[] args) {
		Employee e=new EmployeeHR();
		e.work();
	}
	EmployeeHR(){
		super(21,80);
	}

}
