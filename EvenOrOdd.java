package Tasks;
import java.util.Scanner;
public class EvenOrOdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a  number: ");
		int a=sc.nextInt();
if(a%2==0) {
	System.out.println("Even");
}
else {
	System.out.println("Odd");
}
	}

}
