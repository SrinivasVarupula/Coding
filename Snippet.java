import java.util.PriorityQueue;
import java.util.Scanner;

public class Snippet {
static int v =0;
	public static int reverse(int x) {
		if(x==0)
    		return v;
        int s = x%10;
        v=v*10+s;
        reverse(x/10);
        return v;
        
    }

	public static void main (String[] args) {
		System.out.println(reverse(123));
}
}