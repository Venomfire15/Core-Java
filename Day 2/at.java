/* 153
1. Any Digit Armstrong number (Use Math.pow)
2. print Armstrong number from 1 to 10000
*/

import java.util.Scanner;

class at{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		int range,rem=0,rem1,sum=0,num,no,count=0,temp;

		System.out.println("Enter Range : ");
		range = sc.nextInt();

		for(int i=1;i<=range;++i){
			temp = num = no = i;
			count=0;
			while(no>0){
				//rem = no%10;
				//System.out.println(rem);
				count++;
				no = no/10;
			}
			//System.out.println(count);
		
			//no = num = i;

			//System.out.println(num);
			while(num>0){
				rem1 = num%10;
				//System.out.println(rem1);
				//System.out.println(count);
				sum = (int)(Math.pow(rem1,count));
				//System.out.println(sum);
				num = num/10;
			}
			
			if(sum == temp)
				System.out.println(i);

		}
		
	}
}	
