//Employee and HR MAnager

class Employee{
	int eno,esal;
	String ename,city;

	Employee(int a){
		esal = a;
	}

	void work(){
		System.out.println("Working on Project 1");
	}

	void getSalary(){
		System.out.println(esal);
	}

	void addEmployee(){
		eno = 10; ename = "Vighnesh"; city = "Mumbai";
	}
}

class HRmanager extends Employee{

	HRmanager(){
		super(50000);
	}

	void work(){
		System.out.println("Work on ChatBot");
	}

	void showEmployee(){
		System.out.println("Name : "+ename);
		System.out.println("Employee number "+eno);
		System.out.println("Salary "+esal);
		System.out.println("City "+city);
	}
}

class work{
	public static void main(String[] args) {
		
		Employee e = new Employee(0);
		e.work();

		HRmanager h = new HRmanager();
		h.work();
		h.addEmployee();
		h.showEmployee();
	}
}