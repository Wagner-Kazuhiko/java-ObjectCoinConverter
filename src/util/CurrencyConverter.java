package util;

public class CurrencyConverter {

	public double IOF = 0.06;
	public double dollar;
	public double quantity;
	
	public double DollarToReal() {
	return (dollar * quantity) - (dollar * quantity * IOF);
	}
}
