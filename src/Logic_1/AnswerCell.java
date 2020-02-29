package Logic_1;

public class AnswerCell {
	public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
		if (isAsleep)
			return false;
		if (!isMorning)
			return true;
		if (isMorning && isMom)
			return true;
		return false;
	}
}
