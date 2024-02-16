//Enter no of sem, in that no of sub
//In that enter marks for each subject
//Then show  the maximum marks for each sem.


import java.util.*;

class A14{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of Semester : ");
		int sem = sc.nextInt();

		int sub[] = new int[sem];
		for(int i=0;i<sub.length;++i){
			System.out.println("Enter subject in sem : "+(i+1));
			sub[i] = sc.nextInt();
		}

		int marks[][] = new int[sem][];

		for(int i=0;i<sem;++i){
			marks[i] = new int[sub[i]];
			System.out.println("Enter marks in sem : "+(i+1));
			for(int j=0;j<sub[i];++j){
				marks [i][j] = sc.nextInt();
			}
		}

		for(int i=0;i<sem;++i){
			int max = marks[i][0];
			for(int j=1;j<sub[i];++j){
				if(marks[i][j]>max)
					max = marks[i][j];
			}
			System.out.println("Maximum marks in sem "+(i+1)+" is "+max);
		}
	}
}