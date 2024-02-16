import java.util.Scanner;

abstract class BankAc{
	String name, city;
	int acno, bal;

	BankAc(){
		bal = 1000;
	}

	void inputData(String n, String c, int a){
		name = n; city = c;
		acno = a;
	}

	void display(){

		System.out.println("Name : "+name);
		System.out.println("City : "+city);
		System.out.println("Account Number : "+acno);
		System.out.println("Balance Amount : "+bal);
		System.out.println();
	}

	abstract void deposit(int amount);
	abstract void withdraw(int wid);

}

class SavingAc extends BankAc{

	void deposit(int amount){
		int amt = amount;
		bal = bal+amt;
		System.out.println("Updated Balance "+bal);
		//return bal;
	}

	void withdraw(int wid){
		if(bal<=1000)
			System.out.println("Minimum balance is reached ");
		else{
			bal = bal-wid;
			System.out.println("Updated Balance "+bal);
		}
	}
}

class CurrentAc extends BankAc{

	void deposit(int amount){
		int amt = amount;
		bal = bal+amt;
		System.out.println("Updated Balance "+bal);
		//return bal;
	}

	void withdraw(int wid){
		if(bal<=1000)
			System.out.println("Minimum balance is reached ");
		else{
			bal = bal-wid;
			System.out.println("Updated Balance "+bal);
		}
	}
}


class Interest1 extends SavingAc{
	double calInterest(){
		double rate = 0.04;
		double year = 1;
		double sum = (bal*rate*year);
		return sum;
	}
}


class Interest2 extends CurrentAc{
	double calInterest(){
		double rate = 0.02;
		double year = 1;
		double sum = (bal*rate*year);
		return sum;
	}
}


class Bank2{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		SavingAc s = new SavingAc();
		CurrentAc c = new CurrentAc();
		Interest1 i1 = new Interest1();
		Interest2 i2 = new Interest2();

		while(true){
			System.out.println();
			int no;
			System.out.println("Current Account Balance "+c.bal);
			System.out.println("Saving Account Balance "+s.bal);
			System.out.println();
			System.out.println("1.Input Data");
			System.out.println("2.Display Saving Account");
			System.out.println("3.Deposit Saving Account");
			System.out.println("4.Withdraw Saving Account");
			System.out.println("5.Display Current Account");
			System.out.println("6.Deposit Current Account");
			System.out.println("7.Withdraw Current Account");
			System.out.println("8.Saving Account Interest");
			System.out.println("9.Current Account Interest");
			System.out.println("10.Exit");
			System.out.println("Enter the choice ");
			no = sc.nextInt();
			System.out.println();

			switch(no){
			case 1:
				String name, city;
				int acno; 
				System.out.println("Enter name ");
				name = sc.next();
				System.out.println("Enter city ");
				city = sc.next();
				System.out.println("Enter account number ");
				acno = sc.nextInt();
				s.inputData(name,city,acno);
				c.inputData(name,city,acno);
				break;

			case 2:
				System.out.println("Your Data in Saving Account ");
				s.display();
				break;

			case 3:
				int s_amt;
				System.out.println("Enter amount to deposit in Saving Account");
				s_amt = sc.nextInt();
				s.deposit(s_amt);
				break;

			case 4:
				int s_wid;
				System.out.println("Enter the amount to withdraw in Saving Account ");
				s_wid = sc.nextInt();
				s.withdraw(s_wid);
				break;

			case 5:
				System.out.println("Your Data in Current Account ");
				c.display();
				break;

			case 6:
				int c_amt;
				System.out.println("Enter amount to deposit in Current Account");
				c_amt = sc.nextInt();
				c.deposit(c_amt);
				break;

			case 7:
				int c_wid;
				System.out.println("Enter the amount to withdraw in Current Account ");
				c_wid = sc.nextInt();
				c.withdraw(c_wid);
				break;

			case 8:
				double in1 = i1.calInterest();
				System.out.println(in1);
				break;

			case 9:
				double in2 = i2.calInterest();
				System.out.println(in2);
				break;

			case 10:
				System.exit(0);
			}
		}
	}
}