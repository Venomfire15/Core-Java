import java.util.Scanner;
//COunt Digit
/* while(no>0)
	rem = no%10;
	rev = rev*10+rem;
	no = no/10 */

class cd{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		int no,count=0;

		System.out.println("Enter No. : ");
		no = sc.nextInt();

		while(no>0){
			no = no/10;
			count++;
		}

		System.out.println("No. : "+count);
	}
}