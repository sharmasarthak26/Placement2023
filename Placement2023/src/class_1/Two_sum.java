package class_1;

import java.util.Scanner;

public class Two_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int []nums=new int[n];
		for(int i=0;i<nums.length;i++) {
			nums[i]=s.nextInt();
		}
		int target=s.nextInt();
		for(int i=0;i<nums.length;i++){
	           for(int j=i+1;j<nums.length-1;j++){
	               if(nums[i]+nums[j]==target){
	                   System.out.print(i+" "+j);
	               }
	                   
	              }
		}}
	}
