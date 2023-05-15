package exercicios;

public class Peixe extends Animal {

	private String tipoHabitat;

	
	public String toString(){
		return "Nome: " + getNome()
				+"\nPeso: " +getPeso()
				+"\nTipo Habitat: " +getTipoHabitat();
	}

	public String getTipoHabitat() {
		return tipoHabitat;
	}

	public void setTipoHabitat(String tipoHabitat) {
		this.tipoHabitat = tipoHabitat;
	}
}


