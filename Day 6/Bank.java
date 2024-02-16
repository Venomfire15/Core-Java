import java.util.Scanner;

class BankAc{
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

	void deposit(int amount){
		int amt = amount;
		bal = bal+amt;
		System.out.println("Updated Balance "+bal);
		//return bal;
	}

	void withdraw(int wid){
		int wd = wid;
		bal = bal-wid;
		System.out.println("Updated Balance "+bal);
		//return bal;
	}
}

class SavingAc extends BankAc{

	void withdraw(int wid){
		if(bal<=1000)
			System.out.println("Minimum balance is reached ");
		else{
			bal = bal-wid;
			System.out.println("Updated Balance "+bal);
		}
	}
}

class Bank{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		SavingAc s = new SavingAc();

		while(true){
			System.out.println();
			int no;
			System.out.println("1.Input Data");
			System.out.println("2.Display Data");
			System.out.println("3.Deposit Data");
			System.out.println("4.Withdraw Data");
			System.out.println("5.Exit");
			System.out.println("Enter the choice ");
			no = sc.nextInt();
			System.out.println();

			switch(no){
			case 1:
				String name, city;
				int acno; 
				System.out.println("Enter name, city, account no");
				name = sc.next();
				city = sc.next();
				acno = sc.nextInt();
				s.inputData(name,city,acno);
				break;

			case 2:
				System.out.println("Your Data is ");
				s.display();
				break;

			case 3:
				int amt;
				System.out.println("Enter amount to deposit ");
				amt = sc.nextInt();
				s.deposit(amt);
				break;

			case 4:
				int wid;
				System.out.println("Enter the amount to withdraw ");
				wid = sc.nextInt();
				s.withdraw(wid);
				break;

			case 5:
				System.exit(0);
			}
		}
	}
}