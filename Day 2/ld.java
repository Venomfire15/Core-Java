import java.util.Scanner;

class ld{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any number : ");
		int no = sc.nextInt();

		int res = no%10;

		System.out.println("Last digit is : "+res);
	}
}