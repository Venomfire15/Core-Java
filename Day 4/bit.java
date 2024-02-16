class bit{
	public static void main(String args[]){
		String n = "0000000010001000000010000000000";

		char a[] = n.toCharArray();
		int count=0;

		if(n.length()==32){
			for(int i=0;i<a.length;++i){
				if(a[i]=='1')
					count++;
			}
		}
		else
			System.out.println("Wrong Input");
		System.out.println(count);
	}
}