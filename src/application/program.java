package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.AluguelCarro;
import model.entities.Veiculo;
import model.services.BrazilTaxService;
import model.services.ServicoDeAluguel;

public class program {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm");
		
		
		System.out.println("Entre com os dados do aluguel");
		System.out.print("Modelo do carro: ");
		String modelo = sc.nextLine();
		System.out.print("Retirada (dd/MM/yyyy HH:mm): ");
		LocalDateTime inicio = LocalDateTime.parse(sc.nextLine(),fmt);
		System.out.print("Retorno (dd/MM/yyyy HH:mm): ");
		LocalDateTime fim = LocalDateTime.parse(sc.nextLine(),fmt);
		
		AluguelCarro cr = new AluguelCarro(inicio, fim, new Veiculo(modelo));
		
		System.out.print("Entre com o preço por hora: ");
		double precoHora = sc.nextDouble();
		System.out.print("Entre com o preço por dia: ");
		double precoDia = sc.nextDouble();
		
		ServicoDeAluguel servicoDeAluguel = new ServicoDeAluguel(precoHora, precoDia, new BrazilTaxService());
		
		servicoDeAluguel.processoFatura(cr);
		
		System.out.println();
		System.out.println("FATURA:");
		System.out.println("Pagamento basico: " + cr.getFatura().getPagamentBasico());
		System.out.println("Imposto: " + cr.getFatura().getTaxa());
		System.out.println("Pagamento total: " + cr.getFatura().getPagamentoTotal());
		System.out.println("");
		

		sc.close();
		
		
		
		
		
		
	}

}
