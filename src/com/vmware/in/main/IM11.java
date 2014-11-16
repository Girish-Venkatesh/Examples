package intermediate.tutorials;

import java.awt.DisplayMode;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;



public class IM11 {
	public static void main(String[] args) {
		
		Character[] tmp = {'h', 'k', 'a'};
		
		List<Character> list = Arrays.asList(tmp);
		
		Collections.sort(list);
		
		display(list);
		
		Collections.reverse(list);
		
		display(list);
		
		
		Character[] tmp1 = new Character[list.size()];
		
		List<Character> copylist = Arrays.asList(tmp1);
		
		Collections.copy(copylist, list);
		
		display(copylist);
		
		Collections.fill(copylist, 'x');
		
		display(copylist);
		
		
		
		
	}

	private static void display(List<Character> list) {
		for(Character x: list) {
			System.out.printf("%c ", x);
		}
		
		System.out.println();
		
	}
	
	

}
