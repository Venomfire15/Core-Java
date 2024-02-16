class Parent{
	void msg(){
		System.out.println("Super class");
	}
}

class Child extends Parent{
	void msg(){
		System.out.println("Child Class");
	}
	void display(){
		msg();
		super.msg();
	}
}

class Super2{
	public static void main(String[] args) {
		
		Child c = new Child();
		c.display();
	}
}