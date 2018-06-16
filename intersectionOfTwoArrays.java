import java.util.ArrayList;
import java.util.HashMap;

public class intersectionOfTwoArrays {

	public static int[] find(int[] a, int[] b) {
		HashMap<Integer,Integer> hm = new HashMap<>();
		ArrayList<Integer> al = new ArrayList<>();
		int count=1;
		for(int i:a) {
			if(hm.containsKey(a[i]))
				hm.put(a[i],++count);
			else
				hm.put(a[i],1);		
		}
		for(int i:b) {
			if(hm.containsKey(b[i]))
				hm.put(b[i],--count);
		}
		for(int i:a) {
			if(hm.containsValue(0))
				al.add(i);
		}
		Integer [] f = al.toArray(new Integer[al.size()]);
		int[] total = ArrayUtils.
		return f;
	}
	public static void main(String []args) {
		int[] a = {1,2,2,3,6};
		int[] b = {2,2,7};
		int[] c = find(a,b);
		for(int i:c) {
			System.out.println(c[i]);
		}
	}
}
