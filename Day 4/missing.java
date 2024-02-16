//Missing number in array
import java.util.*;

class missing{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the range : ");
		int no = sc.nextInt();
		System.out.println("Enter the array elements : ");
		int a[] = new int[no];

		int temp=0;
		for(int i=0;i<a.length-1;++i){
			a[i] = sc.nextInt();
		}

		Arrays.sort(a);

		for(int i=0; i<=a.length-1; ++i){
			if(a[i]==i)
				continue;
			else{
				temp = i;
				break;
			}
		} 
		System.out.println(temp);
	}
}