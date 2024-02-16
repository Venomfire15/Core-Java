//Reverse Array

import java.util.*;

class reva{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		int no;
		System.out.println("Enter Array size : ");
		no = sc.nextInt();

		int a[] = new int[no];
		System.out.println("Enter array elements : ");
		for(int i=0;i<=a.length-1;++i){
			a[i] = sc.nextInt();
		}
		System.out.println();

		for(int i=a.length-1;i>=0;--i){
			System.out.println(a[i]);
		}

		//System.out.println(Arrays.toString(a));
	}
}