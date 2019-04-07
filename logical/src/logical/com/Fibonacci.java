package logical.com;

public class Fibonacci {

	public static void main(String[] args) {
		isFibonacci();
	}
	
	public static void isFibonacci() {
		int sum=0;
		int firstNum=0;
		int secondNum=1;
		
		for(int i=0;i<7;i++) {
			
			sum=firstNum+secondNum;
			firstNum=secondNum;
			secondNum=sum;
			
			System.out.println(firstNum);
		}
	}

}
