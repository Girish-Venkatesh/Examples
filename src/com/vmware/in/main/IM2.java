package intermediate.tutorials;

public class IM2 {
	
	public static void main(String[] args) {
		String s1 = "gjhkwakdjijkjkljafjjfjjlhlhh";
		
		System.out.println(s1.indexOf("k"));
		
		System.out.println(s1.indexOf("k", 3));
		
		System.out.println(s1.indexOf("k", 4));
		
		System.out.println(s1.indexOf("z"));
		
		String s2 = "monster";
		String s3 = "india";
		System.out.println(s2+s3);
		System.out.println(s2.concat(s3));
		
		System.out.println(s3.toUpperCase());
		
		//original string will not change to uppercase
		
		System.out.println(s3);
		
		String s4 = s3.toUpperCase();
		System.out.println(s4);
		
		String s5 = "    monsterssss            ";
		String s6 = s5.trim();
		System.out.println(s6);
		
		String s7 = s3.replace("in", "mon");
		System.out.println(s7);
		
	}

}
