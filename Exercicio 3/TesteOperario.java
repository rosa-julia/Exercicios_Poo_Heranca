package exercicio.exercicio3;

public class TesteOperario {

	public static void main(String[] args) {
		Operario operario = new Operario();
		operario.setNome("Rafael");
		operario.setCodigoSetor(10293);
		operario.setEndereco("Arniqueiras");
		operario.setTelefone("992837402");
		operario.setSalarioBase(5000);
		operario.setImposto(1000);
		operario.setValorProducao(100);
		
		System.out.println("Operario: \n" + operario.toString());

	}

}
