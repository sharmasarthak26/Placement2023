package LeetCode;

import java.util.Scanner;

public class Ques_344 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []s= new int[n];
		for(int i=0;i<s.length;i++) {
			s[i]=sc.nextInt();
		}
		reverseString(s);
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i]);
		}
	}
	public static void reverseString(int[] s ) {
		int i=0;
		int j=s.length-1;
		while(i<j) {
			int temp=s[i];
			s[i]=s[j];
			s[j]=temp;
			i++;
			j--;
		}
			}

}
