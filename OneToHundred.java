package Tasks;

public class OneToHundred {

	public static void main(String[] args) {
	int num=1;
OneToHundred(num);
	}
	public static void OneToHundred(int i) {
		if(i<=100){if(i%2==0) {
			System.out.println(i+" is Even");
		}
		else {
			System.out.println(i+" is Odd");
		}
		i++;
		OneToHundred(i);}
		
	}

}
