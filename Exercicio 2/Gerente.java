package exercicio.exercicio2;

public class Gerente extends Empregado{
	private String nomeGerencia;

	public String getNomeGerencia() {
		return nomeGerencia;
	}

	public void setNomeGerencia(String nomeGerencia) {
		this.nomeGerencia = nomeGerencia;
	}
	
	public String toString() {
		return "Nome: " + getNome()
		+"\nIdade: " + getIdade()
		+"\nNome da Gerencia: " + getNomeGerencia()
		+"\nMatricula: " + getMatricula()
		+"\nValor do Inss: " + valorInss();

	}
}
