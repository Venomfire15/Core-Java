class S13{
	public static void main(String args[]){
		String s = "help4code";
		System.out.println(s);

		String s1 = new String("help4code");
		System.out.println(s1);

		char ch[] = {'h','e','l','p','4','c','o','d','e'};
		String s3 = new String(ch);
		System.out.println(s3);

		char ch1[] = {'v','i','g','h','e','l','p','4','c','o','d','e'};
		String s4 = new String(ch1,2,8);
		System.out.println(s4);
	}
}