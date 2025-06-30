package TasksOOPS.OOPS;

import java.util.Scanner;

public class Ns {
 static int a=10;
static int b=20;
int c=50;
int d=5;

public static void Add(int d,int e) {
	int sum=d+e;
	System.out.println(sum);
}
public void Multiply(int d,int e) {
	int product=d*e;
	System.out.println(product);
}
public void Divide(int v, int m) {
	int quotient=v/m;
	System.out.println(quotient);
}

	public static void main(String[] args) {
		Add(a,b);
		Ns n=new Ns();
		n.Multiply(a,b);
		n.Divide(b,n.d);
		
		}

	

}
