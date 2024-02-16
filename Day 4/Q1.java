//char ch[] = s.toCharArray();

import java.util.Scanner;

class Q1{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();
		char ch[] = str.toCharArray();
		String rev = "";

		for(int i=ch.length-1;i>=0;--i){
			//System.out.println(ch[i]);
			rev = rev+ch[i];
		}
		System.out.println(rev.toString());
	}
}