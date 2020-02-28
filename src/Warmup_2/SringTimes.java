package Warmup_2;

public class SringTimes {
	public String stringTimes(String str, int n) {
		String result = "";
		for (int i = 1; i <= n; i++) {
			result = result + str;
		}
		return result;
	}
}
