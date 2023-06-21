package model.entities;

			//Invoice - Fatura
public class Fatura {
	private Double pagamentBasico;
	private Double taxa;

	public Fatura() {
	}

	public Fatura(Double pagamentBasico, Double taxa) {
		this.pagamentBasico = pagamentBasico;
		this.taxa = taxa;
	}

	public Double getPagamentBasico() {
		return pagamentBasico;
	}

	public void setPagamentBasico(Double pagamentBasico) {
		this.pagamentBasico = pagamentBasico;
	}

	public Double getTaxa() {
		return taxa;
	}

	public void setTaxa(Double taxa) {
		this.taxa = taxa;
	}

	public Double getPagamentoTotal() {
		return getPagamentBasico() + getTaxa();
	};

}
