package basicas;


public abstract class Eletronico extends Produto{
	
	private String cor;
	private String nSerie;
	private int tamanho;

	
	public Eletronico(int id, String tipo, String fabricante, double preco) {
		super(id, tipo, fabricante, preco);
	}
		
	//Getters and Setters
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getnSerie() {
		return nSerie;
	}
	public void setnSerie(String nSerie) {
		this.nSerie = nSerie;
	}
	

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	
	
	public abstract void ligar();
	
	public abstract void desligar();

	public abstract void aumentaSom();
	
	
	public void showTamanho() {
		System.out.println("o tamanho deste produto e "+getTipo());
	} 
	
	public void showNSerie() {
		System.out.println("O numero de serie e "+getnSerie());
	}
	
}




