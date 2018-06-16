import java.util.HashMap;
import java.util.Scanner;

public class countPairsWithGivenSum {
	static int counter = 0;
	public static int check(int[] arr, int target) {
	
		for (int i =0; i<arr.length;i++) {
			for (int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==target)
					counter++;
			}
		}
		return counter;
	}
	
		
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int target = sc.nextInt();
		int []arr = {1,2,2};
		//System.out.println(ntime(arr,target));
		//System.out.println(check(arr, target));
		sc.close();
	}
}
