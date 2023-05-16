package exercicio.exercicio3;

public class TesteEmpregado {
	public static void main(String[] args) {
		Empregado empregado = new Empregado();
		empregado.setNome("Julia");
		empregado.setCodigoSetor(123);
		empregado.setEndereco("Asa Sul");
		empregado.setImposto(1000);
		empregado.setSalarioBase(5000);
		empregado.setTelefone("997726382");
		
		System.out.println("Empregado: \n" + empregado.toString());
		
	}
}
