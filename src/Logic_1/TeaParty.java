package Logic_1;

public class TeaParty {
	public int teaParty(int tea, int candy) {
		if ((tea >= 5) && (candy >= 5) && ((tea >= 2 * candy) || (candy >= 2 * tea)))
			return 2;
		if ((tea >= 5) && (candy >= 5))
			return 1;
		return 0;
	}
}
