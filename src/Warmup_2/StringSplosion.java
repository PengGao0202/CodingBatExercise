package Warmup_2;

public class StringSplosion {
	public String stringSplosion(String str) {
		String result = "";
		for (int i = 1; i <= str.length(); i++) {
			result = result + str.substring(0, i);
		}
		return result;
	}
}
