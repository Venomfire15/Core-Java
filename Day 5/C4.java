class Rectangle{
	int len, brt;
	public Rectangle(int a, int b){
		len = a;
		brt = b;
	}

	public void find(){
		int area;

		area  = len*brt;
		System.out.println("Area of Rectangle is : "+area);
	}
}

class C4{
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(4,5);
		Rectangle r2 = new Rectangle(5,8);

		r1.find();
		r2.find();
	}
}