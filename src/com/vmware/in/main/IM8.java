package intermediate.tutorials;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class IM8 {

	public static void main(String[] args) {

		String[] tmp1 = {"arun", "girish", "anath"};
		LinkedList<String> list = new LinkedList<>(Arrays.asList(tmp1));

		list.add("galla");
		list.add("vijay");

		//list to array by specifying list size for number of string elements
		tmp1 = list.toArray(new String[list.size()]);

		for(String x: tmp1) {
			System.out.printf("%s ", x);
		}
	}
	
}	
