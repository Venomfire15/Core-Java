//acccept 5 digit no and find sum of first and last digit in 2 steps

import java.util.Scanner;

class five{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		int no,n1,n2,res;

		System.out.println("Enter number : ");
		no = sc.nextInt();

		n1 = no%10;
		no = no/10000;
		n2 = no%10;
		res = n1+n2;

		System.out.println(res);
	}
}