package exercicio.exercicio3;

public class TesteAdministrador {
	public static void main(String[] args) {
		Administrador administrador = new Administrador();
		administrador.setNome("Renato");
		administrador.setCodigoSetor(54321);
		administrador.setEndereco("Ceilandia");
		administrador.setTelefone("998805543");
		administrador.setSalarioBase(6000);
		administrador.setImposto(2000);
		administrador.setAjudaDeCusto(1000);
		
		System.out.println("Administrador: \n" + administrador.toString());
		
	}
}
