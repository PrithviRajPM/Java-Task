package Tasks;

public class SumOf {

	public static void main(String[] args) {
		int num=Sum(10);
		System.out.println(num);
	}
	public static int Sum(int num) {
		if(num<50) {
			num=num+Sum(num+1);
}
		return num;
	}
}
