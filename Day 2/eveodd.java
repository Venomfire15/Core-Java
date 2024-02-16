//1 to 500 count even and odd

import java.util.Scanner;

class eveodd{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		int eve_count=0, odd_count=0;
		for(int i=1; i<=500; ++i){
			if(i%2==0){
				//System.out.println(i);
				eve_count++;
			}
			else{
				//System.out.println(i);
				odd_count++;
			}
		}

		System.out.println("Even Number Count = "+eve_count);
		System.out.println("Odd Number Count = "+odd_count);
	}
}