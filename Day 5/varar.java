class varar{
	void m1(int... n){
		System.out.println("Vighnesh");
	}
	public static void main(String[] args) {
		varar v = new varar();
		v.m1();
		v.m1(10);
		v.m1(10,20);
		v.m1(10,20,30);
	}
}