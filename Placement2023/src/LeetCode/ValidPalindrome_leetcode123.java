package LeetCode;

import java.util.Scanner;

public class ValidPalindrome_leetcode123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
	    String str=s.next();
	    System.out.println(Pali(str));
	}
	public static boolean Pali(String str) {
		String str1="";
		str=str.toLowerCase();
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(Character.isDigit(ch) || Character.isLetter(ch)) {
				str1=str1+str.charAt(i);
			}
			
		}
		int i=0;
		int j=str1.length()-1;
		while(i<j) {
			if(str1.charAt(i)!=str1.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

}
