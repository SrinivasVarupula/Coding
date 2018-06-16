
public class maxiConseq1 {

	public static int ones(int[] num) {
		int count=0; int m=0;
		for(int i=0;i<num.length;i++) {
			if(num[i]==1) {
				count++;
			}
			else if(count>m) {
				m=count;
				count=0;
			}
			if(i==num.length-1 && num[i]==1 && count>m) {
				m=count;
			}
		}
		return m;
	}
	public static void main(String[] args) {
		int []n = {1,0,1,1,0,1};
		System.out.println(ones(n));
	}
}
