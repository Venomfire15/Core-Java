//Reduce size of string using mathematical logic

class RString{
	public static void main(String[] args) {
		
		String a = "aabbbbeeeeffggg";
		char arr[] = a.toCharArray();

		int count=0;
		String name = "";

		for(int i=0; i<arr.length;++i){
			//System.out.print(" "+arr[i]);
			if(arr[i]==arr[i+1]){
				count++;
			}
			else{
				//System.out.print(arr[i]+""+count+" ");
				name = name+arr[i]+count;
				count = 1;
			}
		}
		System.out.println(name);
	}
}