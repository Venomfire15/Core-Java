import java.util.ArrayList;

class ArrayList1{
	public static void main(String[] args) {
		ArrayList a = new ArrayList();

		a.add("Mac");
		a.add(10);
		a.add("Hello");
		a.add('o');
		a.add(null);

		System.out.println(a); 

		a.remove(2);
		System.out.println(a);

		a.add(2,"Man");
		a.add('z');
		System.out.println(a);

		a.removeAll(a);
		System.out.println(a);
	}
}