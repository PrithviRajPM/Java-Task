package Tasks;

public class FloydsTriangle {

	public static void main(String[] args) {
		int num=5;
		int dig=1;
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(dig+" ");
				dig++;
			}
			System.out.println();
		}
	}

}
