package exercicio.exercicio3;

public class TesteVendedor {

	public static void main(String[] args) {
		Vendedor vendedor = new Vendedor();
		vendedor.setNome("Rebeca");
		vendedor.setCodigoSetor(18263);
		vendedor.setEndereco("Gama");
		vendedor.setTelefone("99394722");
		vendedor.setSalarioBase(6000);
		vendedor.setImposto(1000);
		vendedor.setValorVendas(200);
		
		System.out.println("Vendedor: \n" + vendedor.toString());

	}

}
