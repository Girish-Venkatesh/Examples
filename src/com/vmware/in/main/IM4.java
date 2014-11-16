package intermediate.tutorials;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class IM4 {

	
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
		
	
		
		
		
	}


	
}	
	

	
