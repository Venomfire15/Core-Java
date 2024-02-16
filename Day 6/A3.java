abstract class test{
	test(){
		System.out.println("Me abstract class ka constructor bolta ");
	}
}

class A3 extends test{
	A3(){
		System.out.println("Me normal class constructor brother ");
	}

	public static void main(String[] args) {
		A3 a = new A3();
	}
}