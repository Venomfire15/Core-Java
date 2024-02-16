abstract class ab{
	abstract void m1();
	abstract void m2();
	abstract void m3();
	void m4(){
		System.out.println("Me non abstract re baba!! Pehle se abstract me define hun ");
	}
}

class A1 extends ab{
	public void m1(){
		System.out.println("Me abstract class, mere ko define child me kiya re ");
	}
	public void m2(){
		System.out.println("Me abstract class, mere ko define child me kiya re ");
	}
	public void m3(){
		System.out.println("Me abstract class, mere ko define child me kiya re ");
	}

	public static void main(String[] args) {
		
		A1 a = new A1();

		a.m1(); a.m2(); a.m3(); a.m4();
	}
}