
public class reverseString {

	public static String reverse(String str){
		if(str.length()==0)
			return "";
		char []s= str.toCharArray();
		return swap(s);
	}
	public static String swap(char []s1) {
		char temp = 0;
		for(int i=0;i<s1.length/2;i++) {
			temp=s1[i];
			s1[i]=s1[(s1.length-1)-i];
			s1[(s1.length-1)-i]=temp;
		}
		return String.copyValueOf(s1);
	}
	
	public static void main(String[] args) {
		String s= "ed";
		//reverse(s);
		System.out.println(reverse(s));
	}
	
}
