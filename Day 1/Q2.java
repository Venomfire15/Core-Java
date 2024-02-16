import java.util.Scanner;

class Q2{
	public static void main(String args[]){
		int p1,p2,p3,total;
		int per;
		char ch;

		Scanner sc = new Scanner(System.in);

		System.out.println("enter 3 paper marks ");
		p1 = sc.nextInt();
		p2 = sc.nextInt();
		p3 = sc.nextInt();

		System.out.println("Enter Gender (In f/m)");
		ch = sc.next().charAt(0);

		total = p1+p2+p3;
		per = (total/3);

		System.out.println("Total = "+total);
		System.out.println("Percentage = "+per);

		if(per>=62 && ch == 'f' || per>=45 && ch == 'm')
			System.out.println("Can Take Addmission ");
		else
			System.out.println("can not take Addmission ");

		/*if(per>=45 && ch == 'm')
			System.out.println("Can Take Addmission ");
		else
			System.out.println("can not take Addmission ");*/
	}
}