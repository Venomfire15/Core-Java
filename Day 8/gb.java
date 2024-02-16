//Garbage Collector

class gb{
	public static void main(String[] args) {
		gb g = new gb();
		gb g1 = new gb();

		System.out.println(g);
		System.out.println(g1);

		g=null; //Eligible for garbage collection
		g1=null;//Eligible for Garbage collection
		System.out.println(g);
		System.out.println(g1);
	}
}