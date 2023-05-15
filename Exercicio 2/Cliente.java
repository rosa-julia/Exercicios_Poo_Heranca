package exercicio.exercicio2;

public class Cliente extends Pessoa{
	private double valorDivida;
	private int anoNascim;
	
	public double getValorDivida() {
		return valorDivida;
	}
	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}
	public int getAnoNascim() {
		return anoNascim;
	}
	public void setAnoNascim(int anoNascim) {
		this.anoNascim = anoNascim;
	}
	public String toString() {
		return "Nome: " + getNome()
		+"\nIdade: " + getIdade()
		+"\nSexo: " + getSexo()
		+"\nValor da Divida: " + getValorDivida()
		+"\nAno de Nascimento: " + getAnoNascim();
	}
}
