package Tasks;
import java.util.Scanner;
public class NoOfDays {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the month: ");
		int month=in.nextInt();
		System.out.print("Enter the year: ");
		int year=in.nextInt();
		if(month==1 || month==3 || month==5 || month==7|| month==8 || month==10 || month==12) {
			System.out.println("No of days: 31");
		}
		else if(month==4 || month==6 || month==9 || month==11) {
			System.out.println("No of days: 30");
		}
		else if(month==2) {
			if(((year%4==0) && (year%100!=0)) || (year%400==0)) {
				System.out.println("No of days: 29");
			}
			else {
				System.out.println("No of days: 28");
			}
		}
		else {
			System.out.println("Invalid month");
		}
	}

}
