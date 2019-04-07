package logical;

public class StringToInt {

	public static void main(String[] args) {
		
		int x=StringToInt("java");
		System.out.println(x);
		
			
	}
	
	public static int  StringToInt(String str) {
		
		int sum=0;
		char ch[]=str.toCharArray();
		
		int zeroAscii=(int) '0';
		
		for(char c:ch) {
			int tempAscii=c;
			sum=(sum*10)+tempAscii-zeroAscii;
		}
		
		return sum;
	}

}
