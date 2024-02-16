interface RBI{
	void findinterest();
}

class SBI implements RBI{
	public void findinterest(){
		System.out.println("Mera paisa do, Me SBI!!!");
	}
}

class MB implements RBI{
	public void findinterest(){
		System.out.println("Mera Paisa do, Me MB!!!");
	}
}

class HDFC implements RBI{
	public void findinterest(){
		System.out.println("Mera Paisa do, Me HDFC!!!");
	}
}

class I2{
	public static void main(String[] args) {
		
		/*SBI sb = new SBI();
		MB mb = new MB();
		HDFC h = new HDFC();

		sb.findinterest();
		mb.findinterest();
		h.findinterest();*/

		RBI s1,s2,s3;

		s1 = new SBI();
		s2 = new MB();
		s3 = new HDFC();

		s1.findinterest();
		s2.findinterest();
		s3.findinterest();
	}
}