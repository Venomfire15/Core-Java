//Palindrome

import java.util.Scanner;

class pal{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		int rev=0, rem, no,temp;

		System.out.println("Enter no. ");
		no =sc.nextInt();
		temp = no;

		while(no>0){
			rem = no%10;
			rev = rev*10+rem;
			no = no/10;
		}

		if(rev == temp)
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}
}