package logical.com;

public class PrimeNum {

	public static void main(String[] args) {
	
	checkPrime(27);
		

	}
	
	public static void checkPrime(int n) {
		
		int m=n/2;
		int flag=0;
		
		if(n==0 || n==1) {
			System.out.println(n +" is Prime Number");
		}
		
		else {
			
			for(int i=2;i<=m;i++) {
				
				if(n%i==0) {
					System.out.println(n +" is not Prime Number");
					flag=1;
					
					break;
				}
			}
		}
		
		if(flag==0)
			System.out.println(n +" is Prime Number");
		
	}

}
