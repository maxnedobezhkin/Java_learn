package packagefordmdevlessons.javacore.string;


public class StringRunner {
	public static void main(String[] args) {
		String task1 = "Need change :( to :) :( :( :(";
		String result1 = replace(task1);
		System.out.println(result1);
		
		String task2 = "start sadasd start";
		boolean result2 = checkStartAndFinish("start", task2);
		System.out.println(result2);
		
		String task3 = "123421";
		boolean result3 = isPalindrom(task3);
		System.out.println(result3);
	}
	
	public static String replace(String value) {
		return value.replace(":(", ":)");
	}
	
	public static boolean checkStartAndFinish(String word, String value) {
		return value.startsWith(word) && value.endsWith(word);
	}
	
	public static boolean isPalindrom(String target) {
		boolean result = true;
		for (int i = 0; i < target.length() / 2; i++) {
			if (target.charAt(i) != target.charAt(target.length() - i - 1)) {
				result = false;
				break;
			}
		}
		return result;
	}
}
