import java.util.*;

class revString{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter string : ");
		String a = sc.nextLine();
		
		//System.out.println(a.length());

		for(int i=a.length()-1;i>=0;--i){
			System.out.print(a.charAt(i));
		}
	}
}