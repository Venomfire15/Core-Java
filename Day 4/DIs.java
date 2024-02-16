//Edit Distance

class Dis{
	public static void main(String args[]){
		String s = "ycce";
		String t = "yctce";

		int a = s.length();
		int b = t.length();
		int count=0;

		char s1[] = s.toCharArray();
		char t1[] = t.toCharArray();

		if(a<b)
			System.out.println(b-a);
		else if(b<a)
			System.out.println(a-b);
		else if(a==b){
				for(int i=0;i<s1.length;++i){
					if(s1[i]!=t1[i])
						count = count+1;
				}
				System.out.println(count);
			}
			
		}
}