
public class validAnagram {

	public static boolean find(String s1, String s2) {
		int[] arr = new int[26];
		if(s1.length() != s2.length())
			return false;
		for(int i=0; i<s1.length();i++) {
			arr[(s1.charAt(i)-'a')]++;
			arr[s2.charAt(i)-'a']--;
		}
		for(int i=0; i<26;i++) {
			if( arr[i] != 0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		System.out.println(find("sdirba","bbirds"));
	}
}
