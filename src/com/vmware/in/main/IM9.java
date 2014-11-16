package intermediate.tutorials;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class IM9 {
	
	public static void main(String[] args) {
		
		String[] tmp1 = {"arun", "anath", "galla"};
		List<String> list = Arrays.asList(tmp1);
		
		Collections.sort(list);
		
		display(list);
		
		Collections.reverse(list);
		
		display(list);
		
		Collections.sort(list, Collections.reverseOrder());
		
		display(list);
	}

	private static void display(List<String> list) {
		for(String x : list) {
			System.out.printf("%s ", x);
			
		}
		System.out.println();
		
	}

}
