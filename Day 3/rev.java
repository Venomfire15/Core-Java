class rev{
	public static void main(String args[]){
		java.util.Scanner sc = new java.util.Scanner(System.in);

		int a[] = new int[9];


		System.out.println("Enter array elements : ");
		for(int i=0;i<a.length;++i){
			a[i] = sc.nextInt();
		}

		int j,k,temp =a[0];
		for(j=0,k=8; j<k; ++j, --k){
			temp = a[j];
			a[j] = a[k];
			a[k] = temp;
		}

		for(int i=0;i<9;++i){
			System.out.print(a[i]);
		}
	}
}