abstract class test1{
	abstract void m1();
	abstract void m2();
	abstract void m3();
	void m4(){
		System.out.println("Mere ko abstract nahi kiya ");
	}
}

abstract class test2 extends test1{
	void m1(){
		System.out.println("Me sirf m1 karega, baki ka dekh lo ");
	}
}

abstract class test3 extends test2{
	void m2(){
		System.out.println("Mere ko mat bol me sirf m2 karega ");
	}
}

class A4 extends test3{
	void m3(){
		System.out.println("Har bar mere ko hi sab karna padta he, me kyu main he ?");
	}

	public static void main(String[] args) {
		
		A4 a = new A4();

		a.m1(); a.m2(); a.m3(); a.m4();
	}
}