class Sample extends Thread{

	public static int singleNumber(int[] nums) {
        int result = 0;
    for (int i = 0; i<nums.length; i++)
    {
		result ^=nums[i];
    }
	return result;
    }
	public static void main(String[] args) {
		
		int[] arr = {3,5,3,5,6};
		System.out.println(singleNumber(arr));
		Sample sp = new Sample();
		
		
		//System.out.println(search(arr,9));
	}
	
	
 }
