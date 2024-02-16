//Series 1 sum = 1+x/1+x^2/2..../x^n/n
// Math.pow(x,y) function


import java.util.Scanner;

class Series1{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		double x,n,sum=1;

		System.out.println("Enter the x and n value : ");
		x = sc.nextInt();
		n = sc.nextInt();

		for(int i=1; i<=n; ++i){
			sum = sum+(Math.pow(x,i))/i;
		}

		System.out.println(sum);
	}
}