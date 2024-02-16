import java.util.Scanner;

class find{
	public int check(int a){

		int no=a,rem,temp=0,fact=1,sum=0;
	

		while(no>0){
			rem = no%10;
			no = no/10;
			temp = rem;
			fact = 1;

			while(temp>0){
				fact = fact*temp;
				temp--;
			}

			sum = sum+fact;
		}
		//System.out.println(sum);
		return sum;

	}
}

class strong{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number : ");
		int pass = sc.nextInt();
		int c = pass;
		find f = new find();

		int ret  = f.check(pass);

		if(ret == c)
			System.out.println("Strong Number ");
		else
			System.out.println("Not Strong Number ");
	}
}