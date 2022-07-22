package LeetCode;

import java.util.*;

public class Missing_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int []nums=new int[n];
		for(int i=0;i<nums.length;i++) {
			nums[i]=s.nextInt();
		}
		System.out.println(missingNumber(nums));
	}
	
  
  public static int missingNumber(int[] nums) {
  	int sum=0;
	    for(int i=0;i<nums.length;i++) {
	    	sum=sum+nums[i];
	    	}
	    return (nums.length+1)*nums.length/2-sum;
	    }
}
	
	
//	Alternate Method
//	 public static int missingNumber(int[] nums) {
//	        int s=0;
//	        Arrays.sort(nums);
//	        for(int i=0;i<=nums.length;i++){
//	            s=s^i;
//	    }
//	        for(int i=0;i<nums.length;i++){
//	            s=s^nums[i];
//	        }
//	        return s;
//	}
//}
   
	
