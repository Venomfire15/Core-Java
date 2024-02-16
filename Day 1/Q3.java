import java.util.Scanner;

class Q3{
	public static void main(String args[]){
		String string;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Day in Form of sun,mon,tue.... ");
		string = sc.next();

		if(string.equals("sun") || string.equals("sat"))
			System.out.println("Weekend");
		else
			System.out.println("Working");
	}
}