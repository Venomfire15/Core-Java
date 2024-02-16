import java.util.*;

class magic{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no of elements : ");
		int no = sc.nextInt();
		
		int a[] = new int[no];
		System.out.println("Enter the elements : ");
		for(int i=0;i<a.length;++i){
			a[i] = sc.nextInt();
		}
		//int a[] = {65,66,67,68};

		for(int i=0;i<a.length;++i){
			System.out.println(a[i]+"-"+(char)a[i]);
		}
	}
}