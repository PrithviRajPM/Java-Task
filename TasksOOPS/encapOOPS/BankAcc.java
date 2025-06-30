package TasksOOPS.encapOOPS;

import java.util.Scanner;

public class BankAcc {
	private long accno;
	private double balance;
	public long getAccno() {
		return accno;
	}
	public double getBalance() {
		return balance;
	}
	public void setDetails(long accno, double balance){
		this.accno=accno;
		this.balance=balance;
	}
	BankAcc(long accno, double balance){
		this.accno=accno;
		this.balance=balance;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("----- Getter method -----");
		System.out.println("Enter your bank details");
		BankAcc b1=new BankAcc(sc.nextLong(), sc.nextDouble());
		System.out.println("Account number: "+b1.getAccno());
		System.out.println("Balance: "+b1.getBalance());
		System.out.println("----- Setter method -----");
		System.out.println("Enter 1 to mofify details");
		int input=sc.nextInt();
		if(input==1) {
			System.out.println("Enter your updated bank details");
			b1.setDetails(sc.nextLong(), sc.nextDouble());
			System.out.println("Updated details");
			System.out.println("Account number: "+b1.getAccno());
			System.out.println("Balance: "+b1.getBalance());
		}
		else {
			System.out.println("Invalid option!");
			
		}
	}

}
