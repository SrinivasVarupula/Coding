import java.util.PriorityQueue;
import java.util.Scanner;

public class kthlargestinArray {
	public static int findk(int []arr, int k) {
		PriorityQueue<Integer> p = new PriorityQueue<Integer>();
		for(int i=0;i<arr.length;i++)
			p.offer(arr[i]);
		
		int n = -1;
		while(k>0) {
			n = p.poll();
			k--;
		}
		return n;
		
	}

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int []arr = new int[5];
		System.out.println("Enter 5 Values: ");
		for(int i=0;i<5;i++)
			arr[i]=sc.nextInt();
		System.out.println("Enter the kth element:");
		int k1 = sc.nextInt();
		int k = arr.length-k1+1;
		System.out.println(findk(arr,k));
		sc.close();

}
}
