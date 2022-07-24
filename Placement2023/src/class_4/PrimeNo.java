package class_4;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		prime(n);
		Prime(n);
	}
	
	public static void prime(int n) {
		int isprime=0;
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				isprime=1;
			}
		}
		if(isprime==0) {
			System.out.println("Prime");
		}
		else {
			System.out.println("Not prime");
		}
	}
	
	
//	ALternate Method
	
	
	public static void Prime(int n) {
		int isprime=0;
		for(int i=2;i*i<=n;i++) {
			if(n%i==0) {
				isprime=1;
			}
		}
		if(isprime==0) {
			System.out.println("Prime");
		}
		else {
			System.out.println("Not Prime");
		}
	}
	
//	ALternate Method
	public static void pRime(int n) {
		
	}

}
