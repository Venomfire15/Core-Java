import java.util.*;

class Rclock{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		int no,c=0;
		System.out.println("Enter size of array : ");
		no = sc.nextInt();

		int a[] = new int[no];
		int b[] = new int[no];

		int length = a.length;

		System.out.println("Enter the array elements : ");
		for(int i=0;i<a.length;++i){
			a[i] = sc.nextInt();
		}

		System.out.println("Enter the count to shift : ");
		int shift = sc.nextInt();

		for(int i=0;i<length;++i){
			if(a[i] < a[length-shift])
				b[i+shift] = a[i];
			else if(a[i] <= a[length-1]){
				b[c] = a[i];
				c++;
			}
		}

		System.out.println(Arrays.toString(b));
	}
}