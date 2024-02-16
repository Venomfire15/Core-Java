//any digit reverse

import java.util.Scanner;

class rev{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		int no,sum=0,rem,temp;

		System.out.println("Enter the number : ");
		no = sc.nextInt();

		temp = no;

		while(no>0){
			rem = no%10;
			sum = sum*10+rem;
			no = no/10;
		}

		System.out.println(sum);
	}
}