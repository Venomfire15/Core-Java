class stat7{
	public void show(){
		System.out.println("Non static show");
	}
	static public void show1(){
		System.out.println("Static show 1");
	}
	{
		show();
	}
	static{
		show1();
	}
	public static void main(String[] args) {
		stat7 s = new stat7();
		System.out.println("I am in main");
	}
}