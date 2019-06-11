package basicas;

public abstract class Alimento extends Produto{
 
	private double peso;
	private String nCodBarras;
	
	
	public Alimento(int id, String tipo, String fabricante, double preco) {
		super(id, tipo, fabricante, preco);
	}
	
	
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public String getnCodBarras() {
		return nCodBarras;
	}
	public void setnCodBarras(String nCodBarras) {
		this.nCodBarras = nCodBarras;
	}

	
	public void showPeso() {
		System.out.println("Este produto pesa "+getPeso()+"kg");
	} 
	
	public void showNCodBarras() {
		System.out.println("O numero de codigo de barras e "+getnCodBarras());
	}
	
	public void showTipo() {
		System.out.println("Este produto e "+getTipo());
	}
	
	
}



