import java.util.EmptyStackException;
import java.util.Stack;

public class validParentheses {

	public static boolean find(String s){
		Stack<Character> st = new Stack<>();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='(')
				st.push(')');
			else if(s.charAt(i)=='{')
				st.push('}');
			else if(s.charAt(i)=='[')
				st.push(']');
			else if(st.isEmpty() || s.charAt(i)!=st.pop())
				return false;
		}
		
		return st.isEmpty();
		}
			
	public static void main(String[] args) {
		String s = "]";
		System.out.println(find(s));
	}
}
