/* 153
1. Any Digit Armstrong number (Use Math.pow)
2. print Armstrong number from 1 to 10000
*/

import java.util.Scanner;

class armmax{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		int no,rem,count=0,temp,sum=0,rem1,temp1;

		System.out.println("Enter Number : ");
		no = sc.nextInt();
		temp1 = temp = no;

		//How many Digit
		while(no>0){
			rem = no%10;
			count++;
			no = no/10;
		}

		//System.out.println(count);

		//For checking armstrong
		while(temp>0){
			rem1 = temp%10;
			//System.out.println(rem1);
			sum = sum+(int)(Math.pow(rem1,count));
			temp = temp/10;
		}
		
		if(temp1 == sum)
			System.out.println("Armstrong");
		else
			System.out.println("Not Armstrong");
	}
}	
