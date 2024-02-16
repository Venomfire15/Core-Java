//Find fibonacci forloop

import java.util.Scanner;

class fib{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		int range,f0=0,f1=1,f2;

		System.out.println("Enter Range : ");
		range = sc.nextInt();
		System.out.println("\n");

		System.out.print(f0+"\t"+f1);
		for(int i=3; i<=range; ++i){
			f2 = f0+f1;
			System.out.print("\t"+f2+"\t");
			f0 = f1;
			f1 = f2; 
		}
	}
}