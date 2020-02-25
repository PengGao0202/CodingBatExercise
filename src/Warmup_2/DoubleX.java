package Warmup_2;

public class DoubleX {
	/*Given a string, return true if the first instance 
	  of "x" in the string is immediately followed by another "x".
		
		doubleX("axxbb") → true
		doubleX("axaxax") → false
		doubleX("xxxxx") → true
	*/
	public boolean doubleX(String str) {
		int first = str.indexOf("x");
		//define a newStr and make the 2nd "x" first
		String newStr = str.replaceFirst("x","y");
		int second = newStr.indexOf("x");
		if(first + 1 == second) return true;
		return false;
	}
}
