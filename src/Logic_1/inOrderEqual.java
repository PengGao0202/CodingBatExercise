package Logic_1;

public class InOrderEqual {
	public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
		if ((a > b) || (b > c))
			return false;
		if ((a < b) && (b < c))
			return true;
		if (((a == b) || (b == c)) && equalOk)
			return true;
		return false;
	}
}
