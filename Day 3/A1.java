//2d Array
/* Addition, Smallest Largest, Min Max, Eve Odd
*/


import java.util.Scanner;

class A1{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		int a[][] = new int[3][3];

		System.out.println("Enter the array Elements : ");

		for(int i=0;i<=2;++i){
			for(int j=0;j<=2;++j){

				a[i][j] = sc.nextInt();
			}
		}

		System.out.println("Array Elements are ");
		for(int i=0;i<=2;++i){

			for(int j=0;j<=2;++j){

				System.out.print(a[i][j]);
			}
			System.out.println();
		}

	}
}