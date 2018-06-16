
public class addBinary {

	public static String add(String s1, String s2) {
		char []c1 = s1.toCharArray();
		int l1= c1.length;
		long num1=0; long num2=0;
		char []c2 = s2.toCharArray();
		int l2= c2.length;
		for(int i=l1-1; i>=0 ; i--) {
			num1 += (Character.getNumericValue(c1[i]))*(Math.pow(2, l1-1-i));
		}
		for(int i=l2-1; i>=0 ; i--) {
			num2 += (Character.getNumericValue(c2[i]))*(Math.pow(2, l2-1-i));
		}
		long total=num1+num2;
		if(total==0) return "0";
		StringBuilder sb = new StringBuilder();
		while(total>0) {
		sb.append(total%2);
		total = total/2;
		}
		return sb.reverse().toString();
	}
	public static void main(String[] args) {
		String s1="10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101";
		String s2="110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011";
		String s3=add(s1,s2);
		System.out.println(s3);
	}
}
