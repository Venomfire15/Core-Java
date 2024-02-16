//Program for blank final variable using constructor

class Final{
	final int max;
	Final(){
	max = 100;
	}

	void p(){
		System.out.println(max);
	}

	public static void main(String[] args) {
		Final f = new Final();
		f.p();
	}
}