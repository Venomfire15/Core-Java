class P9{
	public static void main(String args[]){

		int n=10;

		for(int i=1;i<=4;++i){

			for(int j=1;j<=n;++j){
				System.out.print(" ");
			}

			for(int k=1;k<=i;++k){
				System.out.print("*");
			}
			System.out.println();

			--n;

			for(int l=1;l<=4;++l){
				System.out.print("*");
			}
		}
	}
}