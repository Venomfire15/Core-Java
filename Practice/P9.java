//Equilateral Pyramid

class P9{
	public static void main(String args[]){

		int n=10;

		for(int i=0;i<=4;++i){

			for(int j=0;j<=n;++j){
				System.out.print(" ");
			}

			for(int k=0;k<=i;++k){
				System.out.print("*");
			}
			--n;
			//System.out.println();

			for(int m=1;m<=i;++m){
				System.out.print("*");
			}
			System.out.println();
		}

	}
}