import java.util.*;

class Rhc{
	
	public static void main(String args[]){
		
		int a[] = {10,20,30,40,50};
		int n = 1;
		int c=0;
		int length = a.length;
		int b[] = new int[length];
		//System.out.println(length);

		for(int i=0;i<length;++i){
			//System.out.println(a[i]);
			if(a[i] < a[length-n])
				b[i+n] = a[i];
			else if(a[i] <= a[length-1]){
				//System.out.println(a[i]);
				b[c] = a[i];
				c++; 
				//System.out.println(a[i]);
			}
		}

		System.out.println(Arrays.toString(b));
	}
}