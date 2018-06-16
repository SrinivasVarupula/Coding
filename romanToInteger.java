public class romanToInteger {
	public static int find(String s1) {
		int sum = 0;
		if(s1.indexOf("IV") != -1)
			sum-=2;
		if(s1.indexOf("IX") != -1)
			sum-=2;
		if(s1.indexOf("XL") != -1)
			sum-=20;
		if(s1.indexOf("XC") != -1)
			sum-=20;
		if(s1.indexOf("CD") != -1)
			sum-=200;
		if(s1.indexOf("CM") != -1)
			sum -=200;
		
		char[] ch = s1.toCharArray();
		int c =0;
		for(;c<=s1.length()-1;c++){
			if(ch[c] == 'I')
				sum+=1;
			if(ch[c] == 'V')
				sum+=5;
			if(ch[c] == 'X')
				sum+=10;
			if(ch[c] == 'L')
				sum+=50;
			if(ch[c] == 'C')
				sum+=100;
			if(ch[c] == 'D')
				sum+=500;
			if(ch[c] == 'M')
				sum+=1000;
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.println(find("IL"));
		System.out.println("It has some exceptions in Special Cases");
	}
}
