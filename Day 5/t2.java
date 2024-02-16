class this2{
	int a;
	int b;
	this2(){
		this(10,20);
	}

	this2(int x, int y){
		a=x;
		b=y;
		this.show();
	}

	void show(){
		System.out.println(a);
		System.out.println(b);
	}
	
}

class t2{
	public static void main(String[] args) {
		this2 t = new this2();
		this2 t1 = new this2(100,200);
		//t.show();
		//t1.show();
	}
}