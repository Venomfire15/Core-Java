class S14{
	public static void main(String args[]){

		S14 s1 = new S14();
		S14 s2 = new S14();
		System.out.println(s1==s2);

		String t1 = "Vighnesh";
		String t2 = "Vighnesh";
		System.out.println(t1==t2);

		String p1 = new String("help4code");
		String p2 = new String("help4code");

		System.out.println(p1==p2);
	}
}