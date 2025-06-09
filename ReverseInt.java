package Tasks;
import java.util.Scanner;
public class ReverseInt {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any number ");
		long num=sc.nextLong();
		reverse(num);
	}
	public static void reverse(long num) {
		long rev=0;
		while(num>0){
			long dig=num%10;
			rev=rev*10+dig;
			num/=10;
		}
		System.out.println(rev);
	}

}
