package Warmup_2;

public class FrontTimes {
	public String frontTimes(String str, int n) {
		String result = "";
		String front = "";
		if (str.length() < 3) {
			front = str;
		} else if (str.length() >= 3) {
			front = str.substring(0, 3);
		}
		for (int i = 1; i <= n; i++) {
			result = result + front;
		}
		return result;
	}
}
