import java.util.Scanner;

class vow{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		while(true){
		System.out.println("Enter Character : \n for exit Q");
		char a = sc.next().charAt(0);

		switch(a){
		case 'a':System.out.println("Vowel");
				break;
		case 'e':System.out.println("Vowel");
				break;
		case 'i':System.out.println("Vowel");
				break;
		case 'o':System.out.println("Vowel");
				break;
		case 'u':System.out.println("Vowel");
				break;
		case 'A':System.out.println("Vowel");
				break;
		case 'E':System.out.println("Vowel");
				break;
		case 'I':System.out.println("Vowel");
				break;
		case 'O':System.out.println("Vowel");
				break;
		case 'U':System.out.println("Vowel");
				break;

		case 'Q':System.exit(0);
		default : System.out.println("Consonant");

		}
	}	

	}
}