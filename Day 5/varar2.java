class varar2{
	void m1(int... a){
		//System.out.println("Varirable argument = "+a);
		for(int a1:a){
			System.out.print(" "+a1);
		}
	}
	void m1(int a){
		System.out.println("normal argument ="+a);
	}
	public static void main(String[] args) {
		varar2 v = new varar2();
		v.m1(10,20);
	}
}

//javap java.lang.Object