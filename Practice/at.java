/* 153
1. Any Digit Armstrong number (Use Math.pow)
2. print Armstrong number from 1 to 10000
*/

import java.util.Scanner;

class at{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		int no,temp,count=0,temp1,num;

		System.out.println("Enter The Range : ");
		no = sc.nextInt();

		for(int i=1;i<=no;++i){
			count=0;
			temp1 = temp = num = i;

			while(num>0){
				num = num/10;
				count++;
			}
			//System.out.println(count);

			int rem=0,sum=0;

			while(temp>0){
				rem = temp%10;
				sum += (int)Math.pow(rem,count);
				temp = temp/10;
			}
			//System.out.println(sum);

			if(temp1==sum)
				System.out.println(sum);
		}
	}
}	
