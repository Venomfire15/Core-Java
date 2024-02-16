class fiz{
	public static void main(String[] args) {
		
		int n = 15;
		int rem,rem1;

		for(int i=1;i<=n;++i){
			rem = i%3;
			rem1 = i%5;

			if(rem==0 && rem1!=0)
				System.out.println("Fizz");
			else if(rem1==0 && rem!=0)
				System.out.println("Buzz");
			else if(rem==0 && rem1==0)
				System.out.println("FizzBuzz");
			else
				System.out.println(i);
		}
	}
}