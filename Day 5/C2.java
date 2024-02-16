class Student{
	String name = "Vighnesh";
	int roll_no = 120;

	void show(){
		System.out.println(name);
		System.out.println("Roll no : "+roll_no);
	}
}

class C2{
	public static void main(String[] args) {
		Student s = new Student();

		s.show();
	}
}