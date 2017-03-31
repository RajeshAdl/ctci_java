package chapter_1;

public class Is_Unique {
	
	public static boolean is_unique(String s) {
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
	
	public static void main(String[] args) {
		String[] input = {"abcde", "hello", "apple", "kite", "padle"};
		for(String in : input) {
			System.out.println(in+ " " + is_unique(in));
		}
	}

}
