import java.util.Scanner;

class dis{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		double discount,dis;

		System.out.println("Enter Cost Price : ");
		double cp = sc.nextDouble();

		System.out.println("Are you student : y/n ");
		char d = sc.next().charAt(0);

		if(d == 'y'){
			if(cp>=500)
				discount = 0.1;
			else
				discount = 0.05;
		}
		else{
			if(cp>=500)
				discount = 0.08;
			else
				discount = 0.02;
		}

		dis = cp-cp*discount;

		System.out.println("Cost Price "+cp);
		System.out.println("Discounted price = "+dis);
		System.out.println("Discount percentage = "+discount*100);
		System.out.println("Discount applied = "+discount*cp);
	}
}