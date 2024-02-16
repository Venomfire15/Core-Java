interface I1{
	double m1(int i, String str);
	int m1(char ch);
}

class I3 implements I1{
	public double m1(int a, String st){
		System.out.println("double overloaded m1");
		return 44.12;
	}

	public int m1(char c){
		System.out.println("int overloaded m1");
		return 40;
	}

	public static void main(String[] args) {
		
		I3 i = new I3();
		int j = i.m1('d');

		System.out.println("Catch value "+j);

		double d = i.m1(5,"Venom");
		System.out.println("Catch value "+d);
	}
}