package String_1;

public class WithoutX {
	public String withoutX(String str) {
		if (str.equals("x"))
			return "";
		if (str.startsWith("x") && str.endsWith("x"))
			return str.substring(1, str.length() - 1);
		if (str.startsWith("x"))
			return str.substring(1, str.length());
		if (str.endsWith("x"))
			return str.substring(0, str.length() - 1);
		return str;
	}
}
