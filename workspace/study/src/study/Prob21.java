package study;

public class Prob21 {

	public static void main(String[] args) {
		String str = "PROD-001#Z-note#Samsung#3#6000000";
		String[] strs = stringSplit(str, "#");
		System.out.println("===���ڿ� ó�� ���===");
		for (int i = 0; i < strs.length; i++) {
			System.out.println(strs[i]);
		}
	}

	private static String[] stringSplit(String str1, String str2) {
		String[] array = new String[str1.length()];
		String newstring ="";

		for (int i = 0; i < str1.length(); i++) {
				if (str1.charAt(i) == str2.charAt(0)) {
					newstring += "";
				} else {
					newstring += str1.charAt(i);
				}
				array[i]=newstring;
			}

		return array;

	}
}