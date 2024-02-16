//class & object 

class Std{
	int a=10;
	public void show(){
		System.out.println("Hello");
		System.out.println(a);
	}
}

class C1{
	public static void main(String[] args) {
		Std s = new Std();

		s.show();
	}
}