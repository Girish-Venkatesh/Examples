package intermediate.tutorials;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class IM7 {
	
	public static void main(String[] args) {
		
		String[] tmp1 = {"arun", "ananth", "girish"};
		
		List<String> l1 = new LinkedList<>(Arrays.asList(tmp1));
		
		String[] tmp2 = {"girish", "galla", "ramu"};
		
		List<String> l2 = new LinkedList<>(Arrays.asList(tmp2));
		
		l1.addAll(l2);
		
		display(l1);
		
		
		remove(l1, 2, 5);
		display(l1);
		
		Collections.sort(l1);
		display(l1);
		
		Collections.sort(l1, Collections.reverseOrder());
		
		display(l1);
		
	}
	

	private static void remove(List<String> list, int from, int to) {
		
		list.subList(from, to).clear();
	}

	private static void display(List<String> list) {
		
		
		for(String x: list) {
			System.out.printf("%s ", x);
		}
		System.out.println();
			
		
	}

}
