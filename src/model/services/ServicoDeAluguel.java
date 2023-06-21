package model.services;

import java.time.Duration;

import model.entities.AluguelCarro;
import model.entities.Fatura;

			//RentalService
public class ServicoDeAluguel {
	private Double precoHora;
	private Double precoDia;

	private TaxService taxService;

	public ServicoDeAluguel(Double precoHora, Double precoDia, BrazilTaxService taxService) {
		this.precoHora = precoHora;
		this.precoDia = precoDia;
		this.taxService = taxService;
	}

	public void processoFatura(AluguelCarro aluguelCarro) {

		// Duration.between - encontra a duarção entre dois instantes.
		double minutos = Duration.between(aluguelCarro.getInicio(), aluguelCarro.getFim()).toMinutes();
		double horas = minutos / 60.0;

		double basicPayment;
		if (horas <= 12.0) {
			basicPayment = precoHora * Math.ceil(horas);

		} else {
			basicPayment = precoDia * Math.ceil(horas / 24.0);
		}

		double tax = taxService.tax(basicPayment);

		aluguelCarro.setFatura(new Fatura(basicPayment, tax));

	}

}
