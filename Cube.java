package Tasks;
import java.util.Scanner;
public class Cube {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number: ");
		int val=sc.nextInt();
		Cube(val);
	}
	public static void Cube(int val1){
		int cube=0;
		if(val1>=0) {
			cube=val1*val1*val1;
			System.out.println(cube);
		}
		else {
			System.out.println("It's a negative number");
		}
	}

}
