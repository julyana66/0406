package basicas;

public abstract class Higiene extends Produto{
	private String nome;
	private double pesoLiquido;
	private String nCodBarras;


	public Higiene(int id, String tipo, String fabricante, double preco) {
		super(id, tipo, fabricante, preco);
	}

	public Higiene(int id, String tipo, String fabricante, double preco, String nome, double pesoLiquido, String nCodBarras) {
		super(id, tipo, fabricante, preco);
		this.nome = nome;
		this.pesoLiquido = pesoLiquido;
		this.nCodBarras = nCodBarras;
	}

	//Getters and Setters


	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPesoLiquido() {
		return pesoLiquido;
	}
	public void setPesoLiquido(double pesoLiquido) {
		this.pesoLiquido = pesoLiquido;
	}
	public String getnCodBarras() {
		return nCodBarras;
	}
	public void setnCodBarras(String nCodBarras) {
		this.nCodBarras = nCodBarras;
	}


	public void showPesoLiquido() {
		System.out.println("Este produto contem "+getPesoLiquido()+"ml");
	} 

	public void showNCodBarras() {
		System.out.println("O numero de codigo de barras e "+getnCodBarras());
	}
}

	
