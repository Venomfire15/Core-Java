import java.util.Scanner;
/* while(no>0)
	rem = no%10;
	rev = rev*10+rem;
	no = no/10 */

class sum{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		int no, sum=0, rem=0;

		System.out.println("Enter No. : ");
		no = sc.nextInt();

		while(no>0){
			rem = no%10;
			sum = sum+rem;
			no = no/10;
		}

		System.out.println("Sum of digit : "+sum);
	}
}