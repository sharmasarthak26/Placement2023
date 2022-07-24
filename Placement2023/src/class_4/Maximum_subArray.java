package class_4;

import java.util.Scanner;

public class Maximum_subArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int [] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
		Max(arr);
		Maximum(arr);
	}
	public static void Max(int [] arr) {
		int max=0;
		for(int i=0;i<arr.length;i++) {
			int sum=0;
			for(int j=i;j<arr.length;j++) {
				sum=sum+arr[j];
				max=Math.max(sum,max);
			}
		}
		System.out.println(max);
	}

//	 Alternate Method (BY : Kadane's Algorithm)	
	public static void Maximum(int [] arr) {
		int max=0;
		for(int i=0;i<arr.length;i++) {
			int sum=0;
			for(int j=i;j<arr.length;j++) {
				sum+=arr[j];
				if(sum<=0) {
					sum=0;
				}
				max=Math.max(sum, max);
			}
		}
		System.out.println(max);
	}
	
	
}
