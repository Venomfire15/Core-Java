class P11{
	public static void main(String args[]){

		int n=1;
		int sum=0;

		for(int i=1;i<=4;++i){
			sum=0;

			for(int j=1;j<=4;++j){

				System.out.print(n+"\t");
				sum += n;
				n++;
			}
			System.out.print("--->  "+sum);
			System.out.println();
		}
	}
}