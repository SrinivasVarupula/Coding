
public class addDigitsSingle {

	public static int add(int n) {
		if(n==0)
			return 0;
		if(n%9!=0)
			return n%9;
		else return 9;
	}
	public static void main(String[]args) {
		System.out.println(add(29));
	}
}
