package Tasks;
import java.util.Scanner;
public class FloatingDecimal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the first number: ");
		float a=sc.nextFloat();
		System.out.print("Enter the second number: ");
		float b=sc.nextFloat();
		a*=100;
		b*=100;
		if(a==b) {
			System.out.println("It's same");
		}
		else {
			System.out.println("It's not same");
		}
				
	}

}
//float a=10.897f;
//a/=0.01;
//int b=(int)a;
//System.out.println(b);