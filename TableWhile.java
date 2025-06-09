package Tasks;

import java.util.Scanner;

public class TableWhile {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		Table(num);
	}
public static void Table(int num) {
	int mul=1;
	while(mul<=12) {
		System.out.println(num+" * "+mul+" = "+(num*mul));
		mul++;
	}
}
}
