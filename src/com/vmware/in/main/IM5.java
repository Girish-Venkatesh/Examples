package intermediate.tutorials;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class IM5 {

	
	public static void main(String[] args) {
		
		String[] pres = {"adarsh", "girish", "madhura", "bhavya", "nildha"};
		String[] abse = {"adarsh", "bhavya"};

		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();
		
		for(String x : pres) {
			list1.add(x);
		}
		
		for (String y : abse) {
			
			list2.add(y);
			
		}
		
		
		for (int i = 0; i < list1.size(); i++) {
			System.out.printf("%s ", list1.get(i));
			
		}
		System.out.println();
		
		for (int i = 0; i < list2.size(); i++) {
			System.out.printf("%s ", list2.get(i));
			
		}
		
		edit(list1, list2);
		
		System.out.println();
		
		for (int i = 0; i < list1.size(); i++) {
			System.out.printf("%s ", list1.get(i));
			
		}
		
		
		
	}

	private static void edit(Collection<String> l1, Collection<String> l2) {
		
		Iterator<String> it = l1.iterator();
		
		while(it.hasNext()) {
			if(l2.contains(it.next())) {
				it.remove();
			}
		}
		
	}

	
}	
	

	
