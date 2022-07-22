package LeetCode;

import java.util.Scanner;

public class Number_OfOneBit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.println(hammingWeight(n));
	}
	public static int hammingWeight(int n) {
	        int count=0;
	        while(n!=0){
	            n=n&(n-1);
	            count++;
	        }
	        return count;
	    }
        
    
    
    
}


