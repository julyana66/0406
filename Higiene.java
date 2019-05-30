package projetoav2;

public class Higiene extends Produtos {

	private String nome;
	private float pesoliquido;
	private double coddebarras;

	public Higiene(){

	}

	public Higiene(String nome,float pesoliquido,double coddebarras){

		this.nome=nome;
		this.pesoliquido=pesoliquido;
		this.coddebarras=coddebarras;


	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getPesoliquido() {
		return pesoliquido;
	}

	public void setPesoliquido(float pesoliquido) {
		this.pesoliquido = pesoliquido;
	}

	public double getCoddebarras() {
		return coddebarras;
	}

	public void setCoddebarras(double coddebarras) {
		this.coddebarras = coddebarras;
	}


	
	// funcionalidades
	
	public float mostrarPesoLiq (float pesoliquido){
		return getPesoliquido();

	}

	public double mostrarcod(double coddebarras){
		return getCoddebarras();

	}



}
