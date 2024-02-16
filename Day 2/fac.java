//Find factorial forloop

import java.util.Scanner;

class fac{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		int fact=1, no;

		System.out.println("Enter value : ");
		no = sc.nextInt();

		for(int i=1; i<=no; ++i){
			fact = fact*i;
		}

		System.out.println("Factorial = "+fact);
	}
}