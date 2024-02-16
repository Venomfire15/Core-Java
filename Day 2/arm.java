//Armstrong number
/* 153 = 1^3 + 5^3 + 3^3
1+125+27 = 153
*/

import java.util.Scanner;

class arm{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		int sum=0, rem, no, temp;
		System.out.println("Enter the no : ");
		no = sc.nextInt();
		temp = no;

		while(no>0){
			rem = no%10;
			sum = sum+(rem*rem*rem);
			no = no/10;
		}

		if(sum == temp)
			System.out.println("Armstrong");
		else
			System.out.println("Not Armstrong");
	}
}