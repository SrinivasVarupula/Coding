
public class maxSubArrayLength {
	
	public static int length(int []a) {
		int s=0;
		int max=Integer.MIN_VALUE;
		int min=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++) {
			if(a[i]>min)
				min=a[i];
			s=s+a[i];
			if(s>0 && s>=max)
				max=s;
			if(s<0)
				s=0;
		}
		if(min>max)
			return min;	
		return max;
	}

	public static void main(String[] args) {
		int []arr = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(length(arr));
	}
	
}
