//elements occurs atleast twice in array 
// If yes true else false;

import java.util.Scanner;

class twice{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of array : ");
		int no = sc.nextInt();

		int a[] = new int[no];
		System.out.println("Enter the elements of array : ");
		for(int i=0;i<a.length;++i){
			a[i] = sc.nextInt();
		}

		int count=0;
		for(int i=0;i<a.length;++i){
			for(int j=i+1;j<a.length;++j){
				count=0;
				if(a[i]==a[j])
					count++;
			}
		}

		if(count>=2)
			System.out.println("True");
		else
			System.out.println("False");
	}
} 