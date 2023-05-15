package exercicio.exercicio2;

public class Vendedor extends Empregado {
	private double valorVendas;
	private int qntVendas;

	public double getValorVendas() {
		return valorVendas;
	}
	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}
	public int getQntVendas() {
		return qntVendas;
	}
	public void setQntVendas(int qntVendas) {
		this.qntVendas = qntVendas;
	}
	public String toString() {
		return "Nome: " + getNome()
		+"\nSalario: " + getSalario()
		+"\nValor das Vendas: " + getValorVendas()
		+"\nQuantidade de Vendas: " + getQntVendas();
	}

}
