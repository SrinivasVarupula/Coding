
public class twoSumSortedArray {

	public static int[] twoSum(int[]s, int target) {
		int start=0, end=s.length-1;
		while(s[start]+s[end]!=target) {
			if(s[start]+s[end] > target)
				end--;
			else start++;
		}
		if(start>=end)
			return new int[] {0,0};
		return new int[] {start+1,end+1};
		}
	public static void main(String[] args) {
		int[] s= {1,3,5,8};
		int []s1 = twoSum(s,11);
		System.out.println(s1[0]);
		System.out.println(s1[1]);
	}
}
