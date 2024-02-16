//Reverse number with diff with two

import java.util.Scanner;

class r2{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		int range=0;
		System.out.println("Enter Range : ");
		range = sc.nextInt();

		for(int i=range; i>=1; i=i-2){
			System.out.println(i);
		}

	}
}