package exercicio.exercicio3;

public class Operario extends Empregado {
	private double valorProducao;
	
	private double comissao() {
		return valorProducao * 0.10;
	}
	protected double calcularSalario() {
		return comissao() + getSalarioBase() - getImposto() ;
	}
	public double getValorProducao() {
		return valorProducao;
	}
	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
		
	}
	public String toString() {
		return "Codigo Setor: " + getCodigoSetor()
		+"\nNome: " + getNome()
		+"\nEndereco: " + getEndereco()
		+"\nTelefone: " + getTelefone()
		+"\nSalario Base: " + getSalarioBase()
		+"\nValor Producao: " + getValorProducao()
		+"\nImposto: " + getImposto()
		+"\nComissao: " + comissao()
		+"\nCalculo do Salario: " + calcularSalario();

	}
	
}
