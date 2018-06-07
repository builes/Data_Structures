public class CadenaPalindrome {

	public static boolean palindrome(String s){
		
		if(s.length() == 1){
			return true;
		}
		
		if(s.charAt(0) == s.charAt(s.length()-1)){
			return palindrome(s.substring(1, s.length()-1));
		}
		
		return false;
		
	}

	public static void main(String[] args) {
		System.out.println(palindrome("asa"));
	}

}
