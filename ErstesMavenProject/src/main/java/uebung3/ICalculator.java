package uebung3;

/**
 * This Interface is used for Calculators.
 *
 * @author Luisa
 *
 */
public interface ICalculator {
	/**
	 * This Method is used for integer addition.
	 * @param   first   the first integer which should be added.
	 * @param   second   the second integer which should be added.
	 * 
	 * @author Luisa
	 *
	 */
	public int integerAddition(int first, int second);
	
	/**
	 * This Method is used for integer subtraction.
	 * @param   first   the first integer is the base.
	 * @param   second   the second integer should be subtracted.
	 * 
	 * @author Luisa
	 *
	 */
	public int integerSubtraction(int first, int second);
	
	/**
	 * This Method is used for integer multiplication.
	 * @param   first   the first integer which should be multiplicated.
	 * @param   second   the second integer which should be multiplicated.
	 * 
	 * @author Luisa
	 *
	 */
	public int integerMultiplication(int first, int second);
	
	/**
	 * This Method is used for integer diversion.
	 * @param   first   the first integer is the base.
	 * @param   second   the second is the divisor.
	 * 
	 * @author Luisa
	 *
	 */
	public int integerDivision(int first, int second);
}
