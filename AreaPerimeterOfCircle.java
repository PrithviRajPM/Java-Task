package Tasks;
import java.util.Scanner;
public class AreaPerimeterOfCircle {

	public static void main(String[] pri) {
		Scanner in=new Scanner(System.in);
System.out.print("Enter the radius:");
double radius=in.nextDouble();
System.out.println("Area≈ "+Area(radius));
System.out.println("Perimeter≈ "+Perimeter(radius));
	}
	public static double Area(double radius) {
		double area=3.14*radius*radius;
		return area;
	}
	public static double Perimeter(double radius) {
		double perimeter=2*3.14*radius;
		return perimeter;
	}

}
