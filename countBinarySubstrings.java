
public class countBinarySubstrings {

	public static int find(String s) {
		char[] str = s.toCharArray();
		int count=0; int prev=0; int current=1;
		for(int i=1;i<str.length;i++) {
			if(str[i]==str[i-1])
				current++;
			else {
				prev=current;
				current=1;
			}
			if(prev>=current)
				count++;
			
		}
		return count;
		
	}
	public static void main(String[] args) {
		String s = "111";
		int value = find(s);
		System.out.println(value);
	}
}
