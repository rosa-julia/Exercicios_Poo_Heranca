package exercicios;

public class TesteAnimal {

	public static void main(String[] args) {

		Peixe peixe = new Peixe();
		peixe.setNome("Betta");
		peixe.setPeso(10.00);
		peixe.setTipoHabitat("Salgada");
		
		Cachorro cachorro = new Cachorro();
		cachorro.setNome("Lila");
		cachorro.setPeso(100.00);
		cachorro.setRaca("Labrador");
		
		System.out.println("Cachorro " + cachorro.toString());
		System.out.println("Peixe " + peixe.toString());
	}

}
