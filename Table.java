package Tasks;

public class Table {

	public static void main(String[] args) {
		int a=5;
int i=1;
Table(a,i);
	}
	public static void Table(int a, int i) {
		int product=1;
		if(i<=10) {
	        product=a*i; 
			System.out.println(a+" * "+i+" = "+product);
			i++;
			Table(a,i);
			
		}
		
	}

}
