import java.util.*;

class ArrayList3{
	public static void main(String[] args) {
		
		HashSet<String> h = new HashSet<String>();

		h.add("A");
		h.add("B");
		h.add("C");
		h.add("D");
		h.add("D");

		Iterator<String> ir = h.iterator();

		while(ir.hasNext()){
			String str = ir.next();
			System.out.println(str);
		}

		System.out.println(h);
	}
}