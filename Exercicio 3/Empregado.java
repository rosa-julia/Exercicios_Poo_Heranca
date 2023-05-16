package exercicio.exercicio3;

public class Empregado extends Pessoa{
	private int codigoSetor;
	private double salarioBase;
	private double imposto;
	
	protected double calcularSalario() {
		return salarioBase - imposto;
	}

	public int getCodigoSetor() {
		return codigoSetor;
	}

	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double getImposto() {
		return imposto;
	}

	public void setImposto(double imposto) {
		this.imposto = imposto;
	}
	public String toString() {
		return "Codigo Setor: " + getCodigoSetor()
		+"\nNome: " + getNome()
		+"\nEndereco: " + getEndereco()
		+"\nTelefone: " + getTelefone()
		+"\nSalario Base: " + getSalarioBase()
		+"\nImposto: " + getImposto()
		+"\nCalculo do Salario: " + calcularSalario();

	}
}
