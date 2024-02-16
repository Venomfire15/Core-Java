//First Bad version;

class check{
	public static void main(String args[]){
		int n=5 , bad = 4;

		for(int i=1;i<=n;++i){
			if(i>=bad)
				System.out.println("true");
			else
				System.out.println("false");
		}
	}
}