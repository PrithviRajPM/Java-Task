package Tasks;

public class NaturalNumbers {

	public static void main(String[] args) {
		int num=1;
	natural(num);
}
	public static void natural(int num1) {
		System.out.println(num1);
		if(num1<10) {
			num1++;
		natural(num1);}
	
	}

}
