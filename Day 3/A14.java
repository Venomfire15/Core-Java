import java.util.*;

class A14{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		int sem,n;

		System.out.println("Enter the Number of Semester : ");
		sem = sc.nexInt();

		System.out.println("Enter the Number of Subjects : ");
		n = sc.nexInt();

		int sub[] = new int[n];

		for(int i=0;i<sem;++i){
			sub[i] = sc.nexInt();
		}

		int marks[] = new int[n];
		int maxMarks[] = new int[n];

		for(int i=0; i<n;++i){
			for(int j=0; j<sub[i];++j){
				marks[i] = sc.nextInt();
			}

			if(marks[i]>marks[i+1])
				maxMarks[i] = marks[i];
		}

		System.out.println(Arrays.toString(maxMarks));
	}
}