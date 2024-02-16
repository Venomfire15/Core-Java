//

import java.util.Scanner;

class Q3{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the string ");
		String s = sc.nextLine();
		System.out.println("Enter Character to remove : ");
		char a = sc.next().charAt(0);

		String s2 = s.replace(a,'\0');
		String s3 = s2.trim();
		System.out.println(s2);
	}	
}