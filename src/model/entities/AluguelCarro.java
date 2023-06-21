package model.entities;

import java.time.LocalDateTime;
			//CarRental - Tradu��o
public class AluguelCarro {
	private LocalDateTime inicio;
	private LocalDateTime fim;
	
				//Invoice
	private Fatura fatura;
				//Vehicle
	private Veiculo veiculo;

	public AluguelCarro() {
	}

	public AluguelCarro(LocalDateTime inicio, LocalDateTime fim, Veiculo veiculo) {
		this.inicio = inicio;
		this.fim = fim;
		this.veiculo = veiculo;
	}

	public LocalDateTime getInicio() {
		return inicio;
	}

	public void setInicio(LocalDateTime inicio) {
		this.inicio = inicio;
	}

	public LocalDateTime getFim() {
		return fim;
	}

	public void setFim(LocalDateTime fim) {
		this.fim = fim;
	}

	public Fatura getFatura() {
		return fatura;
	}

	public void setFatura(Fatura fatura) {
		this.fatura = fatura;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

}
