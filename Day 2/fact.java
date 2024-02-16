import java.util.Scanner;
/* while(no>0)
	rem = no%10;
	rev = rev*10+rem;
	no = no/10 */

class fact{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		int no,fact=1;

		System.out.println("Enter No. : ");
		no = sc.nextInt();

		while(no>0){
			fact = fact*no;
			//System.out.print(no+"*");
			//System.out.print(fact+"-->");
			--no;
		}

		System.out.println("\n Factorial is : "+fact);
	}
}