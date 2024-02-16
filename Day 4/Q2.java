//Palindrome

import java.util.Scanner;

class Q2{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter String : ");
		String str = sc.nextLine();
		char ch[] = str.toCharArray();
		String rev = "";

		for(int i=0; i<=ch.length-1;++i){
			rev = ch[i]+rev;
		}

		if(rev.equals(str))
			System.out.println("Palindrome ");
		else
			System.out.println("Not Palindrome ");
	}	
}