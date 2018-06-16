
public class addTwoInt {

	public static int add(int i, int j) {
		while(j!=0) {
			int carry = i&j;
			i=i^j;
			j=carry<<1;
		}
		return i;
	}
	public static void main(String[]args) {
		System.out.println(add(2,10));
	}
}
