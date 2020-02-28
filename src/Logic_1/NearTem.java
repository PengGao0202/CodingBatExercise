package Logic_1;

public class NearTem {
	public boolean nearTen(int num) {
		if ((num % 10 <= 2) || (num % 10 >= 8))
			return true;
		return false;
	}
}
