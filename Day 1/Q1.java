import java.util.Scanner;

class Q1{
	public static void main(String args[]){
		int p1,p2,p3;

		Scanner sc = new Scanner(System.in);

		System.out.println("enter 3 paper marks ");
		p1 = sc.nextInt();
		p2 = sc.nextInt();
		p3 = sc.nextInt();

		if(p1<45 || p2<45 || p3<45)
			System.out.println("Fail");
		else
			System.out.println("Pass");
	}
}