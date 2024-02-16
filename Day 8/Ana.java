//Anagram
import java.util.*;

class Ana{
	public static void main(String[] args) {
		String s = "anagram", t = "nagaram";
		int count=0;

		char a [] = s.toCharArray();
		char b [] = t.toCharArray();

		Arrays.sort(a);
		Arrays.sort(b);

		//boolean f = Arrays.equals(a,b);
		if(Arrays.equals(a,b)==true)
			System.out.println("True");
		else
			System.out.println("False");
	}
}