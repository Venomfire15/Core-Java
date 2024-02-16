import java.util.*;

class A{
	void add(int a, int b){
		System.out.println(a+b);
	}
	void add(int a, int b, int c){
		System.out.println(a+b+c);
	}
	void add(int a, int b, int c, int d){
		System.out.println(a+b+c+d);
	}
}

class O1{
	public static void main(String[] args) {
		A a = new A();

		a.add(5,6);
		a.add(1,2,3);
		a.add(3,4,5,6);
	}
}