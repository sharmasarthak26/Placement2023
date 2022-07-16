package class_2;

import java.util.Scanner;

public class Battery_level {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t-->0) {
			int n=s.nextInt();
			if(15<n) {
				System.out.println("No");
			}
			else {
				System.out.println("Yes");
			}
		}
	}

}
