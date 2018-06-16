import java.util.HashMap;

public class duplicatesInArray {

	public static boolean find(int[] num) {
		HashMap<Integer, Integer> hm = new HashMap<>();
		for(int i=0;i<num.length;i++) {
			if(hm.containsKey(num[i]))
				return true;
			hm.put(num[i],1);
		}
		return false;
	}
	public static void main(String[] args) {
		int[] num = {1,7,4,2,3};
		System.out.println(find(num));
	}
}
