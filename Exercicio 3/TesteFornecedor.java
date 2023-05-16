package exercicio.exercicio3;

public class TesteFornecedor {

	public static void main(String[] args) {
		Fornecedor fornecedor = new Fornecedor();
		fornecedor.setNome("Antonio");
		fornecedor.setEndereco("Taguatinga Sul");
		fornecedor.setTelefone("998827362");
		fornecedor.setValorCredito(10000.00);
		fornecedor.setValorDivida(1000.00);
		
		System.out.println("Fornecedor: \n" + fornecedor.toString());
	}
}
