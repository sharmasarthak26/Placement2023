package class_2;

import java.util.Scanner;

public class Running_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner s=new Scanner(System.in);
//		int n=s.nextInt();
//		int []nums=new int[n];
//		for(int i=0;i<nums.length;i++) {
//			nums[i]=s.nextInt();
	int []nums= {1,2,3,4,5};
		int sum=0;
	        for(int i=0;i<nums.length;i++){
	            sum+=nums[i];
	            nums[i]=sum;
	        }
	        for(int i=0;i<nums.length;i++){
		        System.out.print(nums[i]+" ");

	        }
	        
	}

}
