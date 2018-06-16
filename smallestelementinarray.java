import java.util.Scanner;

public class smallestelementinarray {

	public static int find(int []arr) {
		int s = Integer.MAX_VALUE;
		for(int i =0;i<arr.length;i++) {
			if(arr[i]<s)
				s=arr[i];
		}
		return s;
	}

	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int[] arr = new int[4];
	System.out.println("Enter 4 elements:");
	for(int i =0; i<4;i++)
		arr[i]=sc.nextInt();
	System.out.println(find(arr));
	sc.close();	
	}
	
}
