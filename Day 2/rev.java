import java.util.Scanner;

class rev{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		int no,n1,n2,n3,n4,rev;

		System.out.println("Enter any number : ");
		no = sc.nextInt();

		n1 = no%10;
		no = no/10;  
		n2 = no%10;
		no = no/10;
		n3 = no%10;
		no = no/10;
		n4 = no%10;

		rev = n1*1000+n2*100+n3*10+n4*1;

		System.out.println("Addition of two digit : "+rev);
	}
}