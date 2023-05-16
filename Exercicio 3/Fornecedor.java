package exercicio.exercicio3;

public class Fornecedor extends Pessoa {
	private double valorCredito;
	private double valorDivida;
	
	public double getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}

	public double getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}

	private double obterSaldo() {
		return valorCredito - valorDivida;
	}
	
	public String toString() {
		return "Nome: " + getNome()
		+"\nEndereco: " + getEndereco()
		+"\nTelefone: " + getTelefone()
		+"\nValor do Credito: " + getValorCredito()
		+"\nValor da Divida: " + getValorDivida()
		+"\nSaldo: " + obterSaldo();

	}
}
