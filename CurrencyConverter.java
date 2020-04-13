package _0entities;

public class CurrencyConverter {

	public static double IOF = 0.06 + 1.0;

	public static double valueToPay(double value, double price) {

		return value * price * IOF;
	}

}
