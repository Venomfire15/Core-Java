class S15{
	public static void main(String args[]){

		String s1 = "Ashish";
		StringBuffer sb1 = new StringBuffer(s1);
		System.out.println(sb1);

		StringBuffer sb2 = new StringBuffer("Prashant");
		String s2 = sb2.toString();
		System.out.println(s2);
	}
}