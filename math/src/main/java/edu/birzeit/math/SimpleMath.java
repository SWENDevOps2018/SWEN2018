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

	public static <T> T add(Number number1, Number number2) {

		if (number1.getClass() == Integer.class) {
			// With auto-boxing / unboxing
			return (T) (Integer) (number1.intValue() + number2.intValue());
		} else if (number1.getClass() == Double.class) {
			// Without auto-boxing / unboxing
			return (T) (Double) (number1.doubleValue() + number2.doubleValue());
		} else if (number1.getClass() == Long.class) {
			// Without auto-boxing / unboxing
			return (T) (Long)(number1.longValue() +  number2.longValue());
		}
		
		return null;
	}
	public static double factorial_lena(double number)
	{

		if (number <= 1)
			return 1;

		return number * factorial_lena(number - 1);
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
	
	public static double squareRoot_BaraaAyyash(Number number) {
		return Math.sqrt(number.doubleValue());
	}
	
}
