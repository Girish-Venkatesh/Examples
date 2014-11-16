package intermediate.tutorials;
public class IM1 {

	public static void main(String[] args) {

		String[] sample = {"bunk", "munk", "sunk", "burk"};

		for (String word : sample) {

			if(word.startsWith("bu")) {
				System.out.println(word + " starts with bu");
			}

		}

		for (String word : sample) {

			if(word.endsWith("nk")) {
				System.out.println(word + " ends with nk");
			}

		}


	}

}
