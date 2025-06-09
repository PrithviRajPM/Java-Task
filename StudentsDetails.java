package Tasks;

import java.util.Scanner;

public class StudentsDetails {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the student name: ");
		String name=sc.next();
		System.out.print("Enter the student's registration no: ");
		long registrationno=sc.nextLong();
		System.out.print("Enter the student's age: ");
		int age=sc.nextInt();
		System.out.print("Tamil: ");
		double s1=sc.nextDouble();
		System.out.print("English: ");
		double s2=sc.nextDouble();
		System.out.print("Science: ");
		double s3=sc.nextDouble();
		System.out.print("Maths: ");
		double s4=sc.nextDouble();
		System.out.print("Social: ");
		double s5=sc.nextDouble();
		sc.close();
		System.out.println("-----Student's details------");
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Registration no: "+registrationno);
		System.out.println("The average is "+Average(s1,s2,s3,s4,s5));

	}
	public static double Average(double s1,double s2,double s3,double s4,double s5) {
		double average=Sum(s1,s2,s3,s4,s5) / 5;
		return average;
	}
	public static double Sum(double s1,double s2,double s3,double s4,double s5) {
		double sum=s1+s2+s3+s4+s5;
		return sum;
	}

}
