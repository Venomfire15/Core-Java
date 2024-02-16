import java.util.*;

class A10{
	public static void main(String args[]){

		int[] a = {23,42,52,35,69,55,99,83,28,19};

		int indexPos = 2;
		int nextVal = 5;

		System.out.println("Original Array : "+Arrays.toString(a));

		for(int i=a.length-1; i>indexPos; i--){
			a[i] = a[i-1];
		}

		a[indexPos] = nextVal;
		System.out.println("New Array :"+Arrays.toString(a));
	}
}