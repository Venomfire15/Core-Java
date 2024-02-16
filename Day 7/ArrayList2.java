import java.util.*;

class ArrayList2{
	public static void main(String[] args) {
		ArrayList <String> color_list = new ArrayList<>(4);

		color_list.add("White");
		color_list.add("Black");
		color_list.add("Green");
		color_list.add("Purple");

		System.out.println("__Color_List__");
		for(int i=0;i<4;++i){
			System.out.println(color_list.get(i));
		}

		ArrayList<String> sample = new ArrayList<>(3);

		sample.add("Red");
		sample.add("Blue");
		sample.add("LOLODILE");

		color_list.addAll(sample);

		System.out.println("New size "+color_list.size());

		System.out.println("__NEWLIST__");
		for(int i=0;i<color_list.size();++i){
			System.out.println(color_list.get(i));
		}
	}
}