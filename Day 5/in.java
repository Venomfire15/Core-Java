class A{
	static public void showA(){
		System.out.println("I am in showA");
	}
}
class B extends A{
	 static public void showB(){
		System.out.println("I am in showB");
	}
}

class in{
	public static void main(String[] args) {
		B ob = new B();
		ob.showA();
		ob.showB();

		A ob1 = new A();
		ob1.showA();
	}
}