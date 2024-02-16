//InterFace

interface I1{
	void show1();
}

class H implements I1{
	public void show1(){
		System.out.println("Show 1");
	}

	void show2(){
		System.out.println("Show 2");
	}
}

class Interface{
	public static void main(String[] args) {
		H h = new H();

		h.show2();

		I1 i = h;
		i.show1();
	}
}