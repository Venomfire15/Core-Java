import java.util.Scanner;

class calc{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		System.out.println("Welcome To Calculator");
		while(true){
			System.out.println("\n Enter two numbers ");
			int a = sc.nextInt();
			int b = sc.nextInt();

			System.out.println("1.Addition \n 2.Substraction \n 3.Division \n 4.Multiplication \n 5.Exit \n Enter the choice ");
			int n = sc.nextInt();

			switch(n){
			case 1: System.out.println("Addition is "+(a+b));
					break;
			case 2: System.out.println("Substraction is "+(a-b));
					break;
			case 3: System.out.println("Division is "+(a/b));
					break;
			case 4: System.out.println("Multiplication is "+(a*b));
					break;
			case 5: System.exit(0);

			default: System.out.println("Invalid Number:");
					break;
			}
		}
	}
}