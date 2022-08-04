package HomeWork;

import java.util.Scanner;

public class Reverse_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.next();
		System.out.println(Reverse(str));
		
		
	
	}
	public static char[] Reverse(String str) {
		int i=0;
		int j=str.length()-1;
		char [] ch=str.toCharArray();
		while(i<j) {
			char t=ch[i];
			ch[i]=ch[j];
			ch[j]=t;
		i++;
		j--;
	}
//    System.out.println(ch);
		return ch;
}}
