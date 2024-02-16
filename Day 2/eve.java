//Find Even 1 to 20 forloop

import java.util.Scanner;

class eve{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		int range,sum=0;

		System.out.println("Give Range : ");
		range = sc.nextInt();

		for(int i=1; i<=range; i++){
			if(i%2==0)
				sum += i;
		}

		System.out.println("Sum of Even number = "+sum);
	}
}