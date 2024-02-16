class C{
	static public void showChild(){
		System.out.println("I am Father");
	}
}

class A extends C{
	static public void showA(){
		System.out.println("Iam Sister ");
	}
}

class B extends C{
	static public void showB(){
		System.out.println("Iam Brother ");
	}
}

class in3{
	public static void main(String[] args) {
		
		A ob = new A();
		B ob1 = new B();

		ob.showChild();
		ob.showA();
		ob1.showB();
		ob.showChild();		
	}
}