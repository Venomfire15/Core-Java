class stat{
	//Static variable
	static int num = staticMethond();

	//static block
	static{
		System.out.println("Inside static block :");
	}

	//static method
	static int staticMethond(){
		System.out.println("from StaticMethod");
		return 40;
	}

	public static void main(String[] args) {
		System.out.println("num :"+num);
		System.out.println("From main");
	}
}