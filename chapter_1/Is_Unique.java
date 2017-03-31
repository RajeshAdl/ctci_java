package chapter_1;

public class Is_Unique {
	
	public static boolean is_unique1(String s) {
		if(s.length() > 128) {
			return false;
		}
		
		boolean[] char_set = new boolean[128];
		for(int i=0; i<s.length(); i++) {
			int val = s.charAt(i);
			if(char_set[val]) {
				return false;
			}
			char_set[val] = true;
		}
		return true;
	}
	
	public static boolean is_unique2(String s) {
		if(s.length() > 26) {
			return false;
		}
		
		int checker = 0;
		for(int i=0; i<s.length(); i++) {
			int val = s.charAt(i) - 'a';
			if((checker & (1<<val)) > 0) {
				return false;
			}
			checker = (1<<val) | checker;
		}
		return true;
	}
	
	public static void main(String[] args) {
		String[] input = {"abcde", "hello", "apple", "kite", "padle"};
		System.out.println("Testing first function");
		for(String in : input) {
			System.out.println(in+ " " + is_unique1(in));
		}
		System.out.println("Testing second function");
		for(String in : input) {
			System.out.println(in+ " " + is_unique2(in));
		}
	}

}
