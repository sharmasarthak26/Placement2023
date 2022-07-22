package LeetCode;

import java.util.Scanner;

public class Maximum_subArray {

	
	 public int maxSubArray(int[] arr) {
	        int n=0;
			int max=arr[0];
			for(int i=0; i<arr.length;i++) {
				n =n+arr[i];
				if(n>max) {
					max=n;
				}
				if(n<0){
					n=0;
				}
	            
				
			}
			return max;
			
			
			
		}

}
