class Triangle{
	int s1,s2,s3;
	public Triangle(){
		s1=4;s2=5;s3=6;
	}

	void Area(){
		float area;

		area = (s1*s2)/2;
		System.out.println("Area "+area);
	}

	void per(){
		int p = s1+s2+s3;
		System.out.println("Perimeter is "+p);
	}
}

class C3{
	public static void main(String[] args) {
		Triangle t = new Triangle();

		t.Area();
		t.per();
	}
}