//3*3 matrix which row or column addition will be 15

import java.util.*;

class Fifteen{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int mat[][] = new int [3][3];
		int mat1[][] = new int [3][3];

		for(int i=0;i<mat.length;++i){
			for(int j=0;j<mat.length;++j){
				mat[i][j] = sc.nextInt();
			}
		}

		System.out.println();
		/*
		for(int i=0;i<mat.length;++i){
			for(int j=0;j<mat.length;++j){
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}*/

		for(int i=0;i<=mat.length-1;++i){
			for(int j=0;j<=mat.length-1;++j){
				mat1[i][j] = mat[i][j]+mat[i][j+1]+mat[i][j+2];
				System.out.println(mat1[i][j]);
			}
		}
	}
}