import java.util.ArrayList;
import java.util.List;

public class multiplesOfxyXY {

	public static List<String> fizzBuzz(int n){
		List<String> l = new ArrayList<String>();
		for(int i=1; i<=n;i++) {
			if(i%15==0)
				l.add("FizzBuzz");
			else if(i%5==0)
				l.add("Buzz");
			else if(i%3==0)
				l.add("Fizz");
			else l.add(Integer.toString(i));
		}
		return l;
	}
	public static void main(String[] args) {
		List<String> s1 = fizzBuzz(20);
		for(String i:s1)
		System.out.println(i);
	}
}
