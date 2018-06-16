
public class countAndSay {
	
	public static String count(int n) {
	
		String value="1";
		int i=1;
		while (n>i) {
			int count=1;
			StringBuilder sb = new StringBuilder();
			for(int j=1; j<value.length();j++) {
				if(value.charAt(j) == value.charAt(j-1))
					count++;
				else {
					sb.append(count);
					sb.append(value.charAt(j-1));
					count=1;
				}
			}
			sb.append(count);
			sb.append(value.charAt(value.length()-1));
			value=sb.toString();
			i++;
		}
		return value;
	}
	
	public static void main(String []args){
		String s = count(10);
		System.out.println(s);
	}

}
