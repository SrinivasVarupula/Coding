
public class hammingDistance {

	public static int distance(int a, int b) {
		int x=a^b,count=0;
		for(int i=0;i<32;i++)
			count = count + (( x >> i ) & 1);
		return count;
	}
	public static void main(String[] args) {
		System.out.println(distance(1,5));
	}
}
