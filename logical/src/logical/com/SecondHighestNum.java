package logical.com;

import java.util.Arrays;

public class SecondHighestNum {

	public static void main(String[] args) {
		int arr[]= {7,3,5,2,1};
		
		int len=arr.length;
		int temp;
		
		for(int i=0;i<len;i++) {
			
			for(int j=i+1;j<len;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
		}
		
		System.out.println(arr[len-2]);
		
	}

}
