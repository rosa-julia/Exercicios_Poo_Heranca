package exercicio.exercicio3;

public class Vendedor extends Empregado {
	private double valorVendas;
	
	private double comissao() {
		return valorVendas * 0.20;
	}
	protected double calcularSalario() {
		return comissao() + getSalarioBase() - getImposto() ;
	}
	public double getValorVendas() {
		return valorVendas;
	}
	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
		
	}
	public String toString() {
		return "Codigo Setor: " + getCodigoSetor()
		+"\nNome: " + getNome()
		+"\nEndereco: " + getEndereco()
		+"\nTelefone: " + getTelefone()
		+"\nSalario Base: " + getSalarioBase()
		+"\nValor Vendas: " + getValorVendas()
		+"\nImposto: " + getImposto()
		+"\nComissao: " + comissao()
		+"\nCalculo do Salario: " + calcularSalario();

	}
	
}
