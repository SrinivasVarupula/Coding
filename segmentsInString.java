
public class segmentsInString {
	
	public static int segments(String str) {
		if (str.isEmpty())
			return 0;
		char []ch = str.toCharArray();
		int i=0; int count=0;
		while(i<ch.length-1) {
			if(ch[i] != ' ' & ch[i+1] == ' ')
				count++;
			i++;
		}
		if(ch[ch.length-1] !=' ')
			count++;
		return count;
	}
	
	public static void main(String[] args) {
		String s = "";
		int words = segments(s);
		System.out.println(words);
	}
}
