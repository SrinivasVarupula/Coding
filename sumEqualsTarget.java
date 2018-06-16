import java.util.HashMap;

public class sumEqualsTarget {
	
	public static int[] twoSum(int[]nums, int target) {
		if(nums.length==0 || nums.length==1)
			return new int[] {0,0};
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for(int i=0;i<nums.length;i++) {
			if(hm.containsKey(nums[i]))
				return new int[] {hm.get(nums[i]),i};
			else 
				hm.put(target-nums[i], i);
		}
		return new int[] {0,0};
	}
	
	public static void main(String[] args) {
		int target=6;
		int []nums = {3,2,4};
		int[] res = twoSum(nums,target);
		for(int i=0;i<res.length;i++)
			System.out.println(res[i]);
	}
}
