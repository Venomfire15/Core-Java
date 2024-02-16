import java.util.Scanner;

class Area{
	int len, brt;

	public Area(int a, int b){
		len = a;
		brt = b;
	}

	public int returnArea(){
		int area = len*brt;
		return area;
		//System.out.println("Area of rectangle is : "+area);
	}
}

class C5{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int b,c;
		System.out.println("Enter length and breadth of rectangle : ");
		b = sc.nextInt();
		c = sc.nextInt();

		Area a = new Area(b,c);
		int area  = a.returnArea();
		System.out.println(area);
	}
}