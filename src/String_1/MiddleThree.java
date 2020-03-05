package String_1;

public class MiddleThree {
	public String middleThree(String str) {
		return str.substring((str.length() - 3) / 2, str.length() - (str.length() - 3) / 2);
	}
}
