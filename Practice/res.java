import java.util.*;

class res{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		int no;
		System.out.println("Enter no of  semester : ");
		no = sc.nextInt();

		int sem[] = new int[no];

		for(int i=0;i<=sem.length-1;++i){
			System.out.println("Enter no sub in sem "+(i+1));
			sem[i] = sc.nextInt();
			}

		for(int i=0;i<=sem.length-1;++i){
			int marks[] = new int[sem[i]];
			int max[] = new int[sem[i]];

			for(int j=0;j<=marks.length-1;++j){
				System.out.println("Enter marks in sem "+(i+1)+" subject "+(j+1));
				marks[j] = sc.nextInt();

				if(marks[j]>marks[j+1])
					max[j] = marks[j];				}
				System.out.println(Arrays.toString(max)); 
			}

	}
}