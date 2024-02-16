import java.util.Scanner;

class Q3{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		char ch;

		while(true){
		System.out.println("Enter the character to check (For quit press q)");
		ch = sc.next().charAt(0);

		if(ch == 'q'){
			System.out.println("Lower Case");
			break;
		}
		else if(ch>= 65 && ch<= 90)
			System.out.println("Upper Case");
		else if(ch>=97 && ch<=122)
			System.out.println("Lower Case");
		else if(ch>48 && ch<=57)
			System.out.println("Is Digit");
		else
			System.out.println("Special Symbol");
	}

	}
}