import java.util.ArrayList;
import java.util.Collections;

public class validPalindrome {
	
	public static String check(String S) {
		ArrayList<Character> al = new ArrayList<>();
		char []ch = S.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if ((ch[i] >= 'a' && ch[i] <= 'z') || (ch[i] >= 'A' && ch[i] <= 'Z'))
				al.add(ch[i]);
		}
		return S;
		
	}
	
	public static void main(String []args) {
		String s = "A man, a plan, a canal: Panama";
		System.out.println(check(s));
	}
}
