//power four

class power{
	public static void main(String args[]){
		int n = 16, k=4,temp=0;

		int a[] = new int[n];

		for(int i=1;i<n;++i){
			a[i] = (int)Math.pow(i,k);
			if(a[i]==n)
				temp = a[i];
		}

		if(temp==n)
			System.out.println("True");
		else
			System.out.println("False");
	}
}