class varar1{
	void m1(char ch, int... a){
		System.out.print(ch);
		for(int a1:a){
			System.out.print(" "+a1);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		varar1 v = new varar1();
		v.m1('A');
		v.m1('B',10);
		v.m1('C',10,20);
		v.m1('D',10,20,30);
	}
}