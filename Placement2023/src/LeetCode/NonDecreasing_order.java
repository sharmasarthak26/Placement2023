package LeetCode;

import java.util.Scanner;

public class NonDecreasing_order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int []nums=new int [n];
		for(int i=0;i<=nums.length;i++) {
			nums[i]=s.nextInt();
		}
		System.out.println(checkPossibility(nums));
	}
	public static boolean checkPossibility(int [] nums) {
        int count=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]>nums[i]){
                count++;
                if(i>=2 && nums[i-2]>nums[i]){
                    nums[i]=nums[i-1];
                }
                else{
                    nums[i-1]=nums[i];
                }
            }
            
        }
        if(count<=1){
            return true;
        }
        else{
            return false;
        }
    }
}

