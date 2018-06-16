
public class judgeRoutes {

	public static boolean find(String s) {
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='L')
				count-=1;
			else if(s.charAt(i)=='R')
				count+=1;
			else if(s.charAt(i)=='T')
				count-=2;
			else if(s.charAt(i)=='D')
				count+=2;
		}
		if(count==0) return true;
		return false;
	}
	public static void main(String[] args) {
		System.out.println(find(""));
	}
}
