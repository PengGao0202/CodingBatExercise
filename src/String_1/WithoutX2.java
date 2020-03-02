package String_1;

public class WithoutX2 {
	public String withoutX2(String str) {
		if (str == "")
			return "";
		if (str == "x")
			return "";
		if ((str.charAt(0) == 'x') && (str.charAt(1) == 'x'))
			return str.substring(2, str.length());
		if (str.charAt(0) == 'x')
			return str.substring(1, str.length());
		if (str.charAt(1) == 'x')
			return str.substring(0, 1) + str.substring(2, str.length());
		return str;
	}
}
