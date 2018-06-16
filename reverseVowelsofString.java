
public class reverseVowelsofString {

	public static String find(String s) {
		int count=0;
		char[] ch = s.toCharArray();
		char []temp = new char[s.length()];
		for(int i=0; i<ch.length;i++) {
			if(ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
				temp[count]=ch[i];
				count++;
			}
		}
		for(int i=0; i<ch.length;i++) {
			if(ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
				ch[i]=temp[count-1];
				count--;
			}
		}
		return String.copyValueOf(ch);
	}
	public static void main(String [] args) {
		String s = "hello";
		String s2 = find(s);
		System.out.println(s2);
	}
}
