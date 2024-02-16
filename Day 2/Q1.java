//import java.util.Scanner;

class Q1{
	public static void main(String args[]){
		java.util.Scanner sc = new java.util.Scanner(System.in);

		int year;

		System.out.println("Enter the Year : ");
		year = sc.nextInt();

		if(year%100 != 0){
			if(year%4==0){
				System.out.println("Not century leap year, But Leap year ");
			}
			else{
				System.out.println("Not a leap Year ");
			}
		}else{
			if(year%400==0)
				System.out.println("Centuary Leap Year ");
			else
				System.out.println("Not a leap year ");
		}
	}
}