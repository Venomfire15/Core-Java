import java.util.Scanner;

class Q3a{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the String ");
		String s = sc.next();

		System.out.println("Enter the character to replace : ");
		String ch = sc.next();

		char a[] = s.toCharArray();
		char b[] = ch.toCharArray();

		String str="";
		for(int i=0;i<=a.length-1;++i){
			if(a[i]==b[0])
				continue;
			else
				str = str+a[i];
		}
		System.out.println(str);
	}
}