//Series 2 sum = 1+x/1+x^2/2!..../x^n/n!

import java.util.Scanner;

class Series2{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		double x,n,sum=1, fact=1,no;

		System.out.println("Enter the x and n value : ");
		x = sc.nextInt();
		n = sc.nextInt();

		for(int i=1; i<=n; ++i){

			no = i;
			while(no>0){
				fact = fact*no;
				--no;
			}

			sum = sum+(Math.pow(x,i))/fact;
		}

		System.out.println(sum);
	}
}