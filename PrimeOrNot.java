package Tasks;
import java.util.Scanner;
public class PrimeOrNot {
	static int count1=0;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int a=sc.nextInt();
		int b=1;
		Prime(a,b);
		if(count1==1) {
			System.out.println("It's a prime");
		}
		else {
			System.out.println("It's not a prime");
		}

	}
	public static void Prime(int a,int b) {
		if(b<a) {
			if(a%b==0) {
				count1++;
			}
			Prime(a,b+1);
		}
		
	}


}


