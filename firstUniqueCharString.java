
public class firstUniqueCharString {

	public static int find(String s) {
		int []f= new int[26];
		for(int i=0;i<s.length();i++) {
			f[s.charAt(i)-'a'] ++;
		}
		for(int j=0;j<s.length();j++) {
			if(f[s.charAt(j)-'a']==1)
				return j;
		}
		return -1;
	}
	public static void main(String[] args) {
		String s = "loveleetcode";
		System.out.println(find(s));
	}
}
