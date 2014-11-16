package intermediate.tutorials;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class IM6 {
	
	public static void main(String[] args) {
		
		String[] tmp1 = {"arun", "ananth", "girish"};
		
		List<String> l1 = new LinkedList<>(Arrays.asList(tmp1));
		
		String[] tmp2 = {"girish", "galla", "ramu"};
		
		List<String> l2 = new LinkedList<>(Arrays.asList(tmp2));
		
		l1.addAll(l2);
		
		display(l1);
	}

	private static void display(List<String> list) {
		
		
		for(String x: list) {
			System.out.printf("%s ", x);
		}
			
		
	}

}
