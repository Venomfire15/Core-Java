import java.util.Scanner;

class Q2{
	public static void main(String args[]){
		double m1, m2, m3, m4, total, per;
		char grade =' ';

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the 4 subject marks : ");
		m1 = sc.nextDouble();
		m2 = sc.nextDouble();
		m3 = sc.nextDouble();
		m4 = sc.nextDouble();

		total = m1+m2+m3+m4;
		per = total/4;

		if(per>=85)
			grade = 'A';
		else if(per>=75 && per<=85)
			grade ='B';
		else if(per>=65 && per<=75)
			grade = 'C';
		else if(per>=55 && per<=65)
			grade = 'D';
		else if(per>=32 && per<=55)
			grade = 'E';
		else
			System.out.println("You Failed.... ");

		System.out.println("Percentage = "+per+"Grade is = "+grade);

	}
}