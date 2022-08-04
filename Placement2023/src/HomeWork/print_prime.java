package HomeWork;

import java.util.*;
import java.util.Scanner;

public class print_prime {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int m=s.nextInt();
		for(int i=m;i<=n;i++) {
			int count=0;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					count+=1;
				    break;
			     }
			}
		if(count==0) {
			System.out.println(i);
		     }
		}

	}
	}


