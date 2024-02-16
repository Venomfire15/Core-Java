class P8{
	public static void main(String args[]){

		int n=1;

		for(int i=4;i>=1;--i){

			for(int k=1;k<=n;++k){
				System.out.print(" ");
			}

			for(int j=1;j<=i;++j){
				System.out.print("*");
			}
			System.out.println();

			n++;
		}
	}
}