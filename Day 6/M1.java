//Multiple Inheritance

interface I1{
	void show();
}

class P{
	static int i=20;
}

class M1 extends P implements I1{
	public void show(){
		System.out.println("InterFace method");
	}

	public static void main(String[] args) {
		I1 b;
		M1 m = new M1();

		b = m;
		b.show();

		System.out.println(i);
	}
}