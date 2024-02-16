class S7{
	public static void main(String args[]){

		String s1 = "Vighnesh";
		boolean b = s1.equalsIgnoreCase("vighnesh");
		System.out.println(b);
		System.out.println(s1.equalsIgnoreCase("Vighnesh"));
		String s2 = "Ashish";
		boolean b1 = s1.equalsIgnoreCase(s2);
		System.out.println(b1);
	}
}