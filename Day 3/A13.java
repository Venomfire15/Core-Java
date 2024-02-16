import java.util.*;

class A13{
	public static void main(String args[]){

		int a[] = {100,80,60,70,60,75,85};
		int res[] = new int[7];
		res[0] =1;

		for(int i=0; i<a.length; i++){
			for(int j=i+1; j<a.length; j++){

				if(a[i]>a[j])
					res[j] = 1;
				else
					res[j] = 2;
			}
		}

		for(int i=0;i<a.length;i++){

			res[i] = res[i]*res[i]*res[i];

			System.out.print(res[i]);
		}
	}
}