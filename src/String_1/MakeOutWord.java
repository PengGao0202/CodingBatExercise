package String_1;

public class MakeOutWord {
	public String makeOutWord(String out, String word) {
		return out.substring(0, 2) + word + out.substring(out.length() - 2, out.length());
	}
}
