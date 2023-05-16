package exercicio.exercicio3;

public class Administrador extends Empregado {
	private double ajudaDeCusto;
	
	protected double calcularSalario() {
		return super.calcularSalario() + ajudaDeCusto;
	}

	public double getAjudaDeCusto() {
		return ajudaDeCusto;
	}

	public void setAjudaDeCusto(double ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}
	public String toString() {
		return "Codigo Setor: " + getCodigoSetor()
		+"\nNome: " + getNome()
		+"\nEndereco: " + getEndereco()
		+"\nTelefone: " + getTelefone()
		+"\nSalario Base: " + getSalarioBase()
		+"\nImposto: " + getImposto()
		+"\nAjuda de Custo: " + getAjudaDeCusto()
		+"\nCalculo do Salario: " + calcularSalario();

	}
}
