package LeetCode;

import java.util.Scanner;

public class Ques_33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int [] nums=new int[n];
		for(int i=0;i<nums.length;i++) {
			nums[i]=s.nextInt();
		}
		int target=s.nextInt();
		search(nums,target);
	}
	 public static int search(int[] nums, int target) {
	        for(int i=0;i<nums.length;i++){
	            if(nums[i]==target){
	                System.out.print(i);
	            }
	        
	        }
	        return -1;
	    }

}
