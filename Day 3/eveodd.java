//minmax, even odd, accept print

class eveodd{
	public static void main(String args[]){

		java.util.Scanner sc = new java.util.Scanner(System.in);

		int a[] = new int[5];

		System.out.println("Enter Elements : ");

		for(int i=0;i<a.length;++i){
			a[i] = sc.nextInt();
		}

		int eve=0,odd=0;

		for(int i=0;i<a.length;++i){
			if(a[i]%2==0)
				eve++;
			else
				odd++;
		}

		System.out.println("Eve = "+eve+"\t Odd = "+odd);
		
	}
}