package exercicio.exercicio2;

public class TestePessoa {
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Julia");
		pessoa.setIdade(19);
		pessoa.setSexo("Feminino");
		
		Cliente cliente = new Cliente();
		cliente.setNome("Lucas");
		cliente.setIdade(30);
		cliente.setAnoNascim(1993);
		cliente.setSexo("Masculino");
		cliente.setValorDivida(1000.00);
		
		Empregado empregado = new Empregado();
		empregado.setNome("Pedro");
		empregado.setIdade(40);
		empregado.setMatricula("12345");
		empregado.setSalario(12000.00);
		empregado.setSexo("Masculino");
		
		Gerente gerente = new Gerente();
		gerente.setNome("Lucia");
		gerente.setMatricula("18920");
		gerente.setIdade(33);
		gerente.setNomeGerencia("Setor vendas");
		gerente.setSalario(20000.00);
		gerente.setSexo("Feminino");
		
		Vendedor vendedor = new Vendedor();
		vendedor.setNome("Vitoria");
		vendedor.setIdade(23);
		vendedor.setMatricula("12039");
		vendedor.setSexo("Feminino");
		vendedor.setQntVendas(30);
		vendedor.setSalario(1000.00);
		vendedor.setValorVendas(20.00);
		
		
		System.out.println("Cliente: \n" + cliente.toString());
		System.out.println("Gerente: \n" + gerente.toString());
		System.out.println("Vendedor: \n" + vendedor.toString());
		
	}
}
