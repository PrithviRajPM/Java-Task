package Tasks;
import java.util.Scanner;
public class PositiveOrNegative {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any number: ");
		int num=sc.nextInt();
		if(num>0) {
			System.out.println("Positive");
		}
		else {
			System.out.println("Negative");
		}

	}

}
