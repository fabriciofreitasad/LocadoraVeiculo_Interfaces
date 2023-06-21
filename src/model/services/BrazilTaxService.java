package model.services;

public class BrazilTaxService implements TaxService {

	public double tax(double quantia) {
		if (quantia <= 100.00) {
			return quantia * 0.2;
		} else {
			return quantia * 0.15;
		}
	}

}
