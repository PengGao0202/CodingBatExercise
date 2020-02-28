package Logic_1;

public class InOrder {
	public boolean inOrder(int a, int b, int c, boolean bOk) {
		if (a < b && b < c && !bOk)
			return true;
		if (b < c && bOk)
			return true;
		return false;
	}

}
