class A{
	static void showA(){
		System.out.println("I am in showA");
	}
}

class B extends A{
	static void showB(){
		System.out.println("I am in showB");
	}
}

class C extends B{
	static void showC(){
		System.out.println("I am in ShowC");
	}
}

class in2{
	public static void main(String[] args) {
		C ob = new C();

		ob.showA();
		ob.showB();
		ob.showC();
	}
}