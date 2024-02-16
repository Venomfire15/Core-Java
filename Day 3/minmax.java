//minmax, even odd, accept print

class minmax{
	public static void main(String args[]){

		java.util.Scanner sc = new java.util.Scanner(System.in);

		int a[] = new int[5];

		System.out.println("Enter Elements : ");

		for(int i=0;i<a.length;++i){
			a[i] = sc.nextInt();
		}

		int min=a[0], max=a[0];

		for(int i=0;i<a.length;++i){
			if(min>a[i])
				min = a[i];
			if(max<a[i])
				max = a[i];
		}

		System.out.println("Max = "+max+"\t Min = "+min);
	}
}