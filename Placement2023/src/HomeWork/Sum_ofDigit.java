package HomeWork;

import java.util.Scanner;

public class Sum_ofDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		SumOfDigit(n);
	}
	public static void SumOfDigit(int n) {
		int sum=0;
		while(n!=0) {
			int r=n%10;
			sum=sum+r;
			n=n/10;
		}
		System.out.println(sum);
	}

}
