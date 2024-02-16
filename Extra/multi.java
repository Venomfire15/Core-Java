//multiple of 3 and 5

class multi{
	public static void main(String[] args) {
		
		int n = 100;
		int rem,rem1,sum=0;

		/*for(int i=1;i<n;++i){
			rem = i%3;
			rem1 = i%5;

			if(rem==0 || rem1==0){
				//System.out.println(i);
				sum = sum+i;
			}
			else
				continue;
		}
		System.out.println(sum);*/

		while(n>100){
			rem = n%3;
			rem1 = n%5;

			if(rem==0 || rem1==0){
				System.out.println(n);
				sum = sum+n;
			}
			else
				continue;
		}
		System.out.println(sum);
		}
	}