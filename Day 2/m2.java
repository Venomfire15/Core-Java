//Multiply 2 positiv no without usin * operator

import java.util.Scanner;

class m2{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		int x,y,mul=0;

		System.out.println("Enter 2 value to multiply : ");
		x = sc.nextInt();
		y = sc.nextInt();

		for(int i=1; i<=y; ++i){
			mul = mul+x;
		}

		System.out.println("Multiplication = "+mul);
	}
}