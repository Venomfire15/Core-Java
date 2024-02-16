class stat5{
	{
		System.out.println("I am in non static block");
	}
	static{
		System.out.println("I am in static block");
	}
	public static void main(String[] args) {
		stat5 s= new stat5();
		System.out.println("I am in main");
	}
}