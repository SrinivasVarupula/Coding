
public class duplicatesInSortedArray {

	public static int duplicates(int[] nums) {
		 int index=0;
			for(int i=1; i<nums.length;i++) {
				if(nums[index]==nums[i]) {
					continue;
				}
	            else {
	                nums[++index]=nums[i];
	            }
			}
			return index+1;

	}
	public static void main(String[] args) {
		int [] nums = {1,6,6,6};
		int v = duplicates(nums);
		System.out.println(v);
	}
}
