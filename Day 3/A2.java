//2d Array
/* Addition, Smallest Largest, Min Max, Eve Odd
*/


import java.util.Scanner;

class A2{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		int a[][] = new int[3][3];
		int sum=0;

		System.out.println("Enter the array Elements : ");

		for(int i=0;i<=2;++i){
			for(int j=0;j<=2;++j){

				a[i][j] = sc.nextInt();
			}
		}

		for(int i=0;i<=2;++i){

			for(int j=0;j<=2;++j){

				sum = sum+a[i][j];
			}
			System.out.println();
		}

		System.out.println("Sum of Array Elements are : "+sum);
	}
}