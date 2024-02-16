import java.util.*;

class A8{
	public static void main(String args[]){
		String [] stArray = {"AB","PR","SD","AB","RL","MN","PR"};

		for(int i=0; i<stArray.length-1;i++){
			for(int j=i+1; j<stArray.length;j++){
				if(stArray[i].equals(stArray[j]) && (i!=j)){
					System.out.println("Duplicates String : "+stArray[j]);
				}
			}
		}
	}
}