
public class findTheDifference {

	public static char find(String s, String t) {
		char c=0;
		for(int i=0;i<s.length();i++)
			c ^= s.charAt(i);
		for(int i=0;i<t.length();i++)
			c ^= t.charAt(i);
		return c;
	}
	public static void main(String[]args) {
		System.out.println(find("abcd","acbfd"));
	}
}
