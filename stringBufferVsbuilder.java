
public class stringBufferVsbuilder {

	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("Start");
		StringBuilder sb2 = new StringBuilder("Start");
		
		long startTime = System.currentTimeMillis();
		
		for(int i=0; i<16000;i++)
			sb1.append(1);
		System.out.println(System.currentTimeMillis()-startTime);
		startTime=System.currentTimeMillis();
		for(int i=0; i<16000;i++)
			sb2.append(1);
		System.out.println(System.currentTimeMillis()-startTime);
	}
}
