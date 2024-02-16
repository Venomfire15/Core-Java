class gb2{
	gb2(){
		System.out.println("Hello");
	}
	public static void main(String[] args) {
		new gb2();
		System.gc(); //Calling garbage collector
	}
}