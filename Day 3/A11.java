import java.util.*;

class A11{
	public static void main(String args[]){
	int a[] = new int[6];
	Arrays.fill(a,100);

	for(int i=0;i<a.length;i++){
		System.out.print(" "+a[i]);
		}

		System.out.println();
		Arrays.fill(a,3,6,44);

		System.out.print(Arrays.toString(a));
	}
}