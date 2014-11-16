
public class Example1 {
	
	public static void main(String[] args) {
		
		String sample1 = "hello world! how are you! hope your fine!";
		String sample2 = "";		
		String sample3 = null;
		
		String cmp1 = "hi";
		String cmp2 = "hi";
		String cmp3 = "hi                   ";
		
		int length = sample1.length();
		System.out.println("String lenth is :"+length);
		
		if(sample2.isEmpty()) {
			System.out.println("Sample2 is empty");
		}
		
		/*if(sample3.isEmpty()) {
			System.out.println("sample3 is empty");
		}*/
		
		if(sample3 == null) {
			System.out.println("sample3 is null");
		}
		
		if(cmp1.equals(cmp2)) {
			System.out.println("cmp1 and cmp2 matches");
		}
		
		
		
		
		
	}

}
