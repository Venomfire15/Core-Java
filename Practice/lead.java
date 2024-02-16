import java.util.*;

class lead{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the array size :");
		int no = sc.nextInt();

		int a[] = new int[no];
		System.out.println("Enter the array elements : ");
		for (int i=0;i<=a.length-1;++i){
			a[i] = sc.nextInt();
		}

		for(int i=0; i<a.length; ++i){
			int j;
			for(j=i+1; j<a.length; ++j){
				if(a[i]<=a[j])
					break;
			}
			if(j==a.length)
				System.out.println(a[i]+" ");
		}
	}
}