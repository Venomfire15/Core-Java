/*1 5
2 4
4 2
5 1*/




class B2{
	public static void main(String args[]){

		int i,j;

		for(i=1,j=5;i<=5;i++,j--){
			if(i==3){
				continue;
			}
			System.out.println(i+"\t"+j);
		}
	}
}