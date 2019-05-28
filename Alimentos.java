package av2;


public class Alimentos extends Produtos {


	private String peso;
	private double codigodebarras;


	public String getPeso() { 
		return peso; 
	}

	public void setPeso(String peso) { 
		this.peso = peso; 
	}

	public double getCodigodebarras() { 
		return codigodebarras;
	}

	public void setCodigodebarras(double codigodebarras) { 
		this.codigodebarras = codigodebarras; 
	}


	public String mostrarpeso (String peso)	{
		return getPeso();
	}


	public double mostrarcodigo(double codigodebarras){
		return codigodebarras;
	}



}
