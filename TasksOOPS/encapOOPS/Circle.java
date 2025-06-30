package TasksOOPS.encapOOPS;

import java.util.Scanner;

public class Circle {
	private float radius;
	public float getRadius(){
		return radius;
	}
	public void setRadius(float radius){
		this.radius=radius;
	}
	Circle(float radius){
		this.radius=radius;
	}
	public static void Area(float r) {
		double area=3.14*r*r;
		System.out.println(area);
	}
	public static void Perimeter(float r) {
		double perimeter=2*3.14*r;
		System.out.println(perimeter);
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
System.out.println("Enter the radius of the circle: ");
float r=sc.nextFloat();
Circle c=new Circle(r);
System.out.println("The radius you've entered is "+c.getRadius());
System.out.println("Enter 1 to find area");
System.out.println("Enter 2 to find perimeter");
System.out.println("Enter 3 to modify the radius");
int input=sc.nextInt();
if(input==1) {
	Area(r);
}
else if(input==2) {
	Perimeter(r);
}
else if(input==3) {
	System.out.println("Enter the radius");
	float r1=sc.nextFloat();
	c.setRadius(r1);
	System.out.println("The radius updated successfully");
	System.out.println("Enter 1 to find area");
	System.out.println("Enter 2 to find perimeter");
	int input1=sc.nextInt();
switch(input1) {
case 1 -> Area(r1);
case 2 -> Perimeter(r1);
default ->System.out.println("Invalid input!");
}
}
else {
	System.out.println("Invalid input!");
}
	}

}
