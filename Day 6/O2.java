class Parent{
	int cash = 2000;
	public void properties(){
		System.out.println("properties");
	}
	public void bike(){
		System.out.println("Splendor");
	}
}

class Child extends Parent{
	int cash = 5000;
	public void bike(){
		System.out.println("HayaBusa");
		System.out.println(cash);
	}
}

class O2{
	public static void main(String[] args) {
		Child c = new Child();

		c.properties();
		c.bike();
	}
}