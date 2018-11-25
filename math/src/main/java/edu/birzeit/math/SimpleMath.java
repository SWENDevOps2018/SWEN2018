package edu.birzeit.math;

import javafx.scene.control.SplitPane.Divider;

/**
 * Class for simple mathematical calculations.<br/>
 * implemented for in-class exercise This package cannot accept String in the
 * params
 *
 * @since 2018-11
 * @version 1.0
 */

public class SimpleMath {

	// CONSTANTS
	// ------------------------------------------

	// METHODS
	// ------------------------------------------

	/**
	 * Add Two numbers.
	 *
	 * @param number
	 *            one, number two
	 * @return Addition of the two numbers
	 * 
	 */
	// TO DO
	// This method needs refactoring -

	public static <T> T add(T number1, T number2) {

		T result = null;

		if (number1.getClass() == Integer.class) {
			// With auto-boxing / unboxing
			result = (T) (Integer) ((Integer) number1 + (Integer) number2);
		} else if (number1.getClass() == Double.class) {
			// Without auto-boxing / unboxing
			result = (T) Double.valueOf(((Double) number1).doubleValue() + ((Double) number2).doubleValue());
		} else if (number1.getClass() == Long.class) {
			// Without auto-boxing / unboxing
			result = (T) Long.valueOf(((Long) number1).longValue() + ((Long) number2).longValue());
		}
		return result;
	}

	public int sinX_hadiAwad(double number) {
		double radians = Math.toRadians(number);
		return (int) Math.sin(radians);
	}
	
	public static double division_layalizidan(double firstNumber, double secondNumber){
		double result = 0;
		if(secondNumber == 0){
			throw new ArithmeticException("Division by zero!");
		}else{
			result = firstNumber/secondNumber;
		}
		return result;
	}
	


}
