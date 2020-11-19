package uebung3;

public class Calculator implements ICalculator {
	public int integerAddition(int first, int second) {
		return first+second;
	}

	@Override
	public int integerSubtraction(int first, int second) {
		return first-second;
	}

	@Override
	public int integerMultiplication(int first, int second) {
		return first*second;
	}

	@Override
	public int integerDivision(int first, int second) {
		return first/second;
	}
}
