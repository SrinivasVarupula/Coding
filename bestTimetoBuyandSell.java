
public class bestTimetoBuyandSell {

	public static int find(int[] n) {
		int count=0;
		for(int i=0;i<n.length-1;i++) {
			if(n[i+1]>n[i])
				count += n[i+1]-n[i];
		}
		return count;
	}
	public static void main(String[] args) {
		int[]a= {1,2,4};
		System.out.println(find(a));
	}
}