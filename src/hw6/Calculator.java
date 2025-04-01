package hw6;

public class Calculator {
	public static double powerXY(int x, int y) throws CalException {
		if (x == 0 && y == 0) {
			throw new CalException("x與y不可同時為0");
		} else if(y < 0) {
			throw new CalException("x的y次方結果不為整數");
		} else {
			return Math.pow(x, y);
		}
	}
}
