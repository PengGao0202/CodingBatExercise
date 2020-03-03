package String_1;

public class MinCat {
	public String minCat(String a, String b) {
		if (a.length() == b.length())
			return a + b;
		if (a.length() < b.length())
			return a + b.substring((b.length() - a.length()), b.length());
		if (a.length() > b.length())
			return a.substring((a.length() - b.length()), a.length()) + b;
		return "";
	}
}
