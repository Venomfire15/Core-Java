//find leaders in array

import java.util.Scanner;

class leader{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the array size : ");
		int no = sc.nextInt();

		int a[] = new int[no];
		System.out.println("Enter the array elements : ");
		for(int i=0;i<a.length;++i){
			a[i] = sc.nextInt();
		}

		System.out.println();
		for(int i=0;i<a.length;++i){
			int j;
			for(j=i+1;j<a.length;++j){
				if(a[i]<=a[j])
					break;
			}
			if(j==a.length)
				System.out.print(a[i]+" ");
			//System.out.println(j);
		}
	}
}