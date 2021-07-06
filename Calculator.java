package mijnrekenmachine;

public class Calculator {
	/*
	 * Methode main hieronder kan je verwijderen nadat het importeren gelukt is.
	 */
	public static void main(String[] args) {
		System.out.println(multiply(10, 5));
	}

	/*
	 * Werk de onderstaande methodes uit.
	 * 
	 * Gebruik enkel de optelling als expressie.
	 * 
	 * Maak gebruik van de nodige control flow structures om de bewerking te
	 * vervolledigen
	 * 
	 * Maak gebruik van gehele getallen.
	 */

	public static int add(int number1, int number2) {

		int result = 0;
		result = number1 + number2;
		return result;
	}

	public static int subtract(int number1, int number2) {
		int result = 0;
		result = number1 - number2;
		return result;
	}

	public static int multiply(int number1, int number2) {
		int result = 0;
		for (int i = 0; i < number1; i++) {
			result += number2;
		}
		return result;
	}

	/*
	 * Zorg ervoor dat number1 deelbaar is door number2
	 * 
	 * Of: wijzig de nodige types zodat je ook andere delingen kan maken.
	 */

	public static int devide(int number1, int number2) {
		int result = 0;
		while (number1 >= number2) {
			number1 = subtract(number1, number2);
			result++;
		}
		return result;
	}
	/*
	 * Methode hieronder is voor een tweede machtsverheffing
	 */

	public static int square(int number1) {
		int result = 0;
		for (int i = 0; i < number1; i++) {
			result += number1;
		}
		return result;
	}

	/*
	 * Methode hieronder is voor de verheffing van het grondgetal 'number1' tot een
	 * willekeurige macht, het exponent 'number2'
	 */

	public static int exponentiation(int number1, int number2) {
		int result = number1;
		int number3 = subtract(number2, 1);
		for (int i = 0; i < number3; i++) {
			result = multiply(result, number1);
		}
		return result;
	}
}
