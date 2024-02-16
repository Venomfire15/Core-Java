class stat6{
	public void show(){
		System.out.println("Non static show");
	}
	{
		show();
	}
	static{
		System.out.println("I am in static block");
	}
	public static void main(String[] args) {
		stat6 s = new stat6();
		System.out.println("I am in main");
	}
}