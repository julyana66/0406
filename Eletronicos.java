package av2;


public class Eletronicos extends Produtos{

	private String cor;
	private double largura;
	private double altura;
	private double cod;
	private int volume;
	
	
	public String showProduto() {
		return "TV" + fabricante + "com " + largura + "de largura" + " " + altura + " de altura" + " "+"código" + cod;
		
	}
	

	public Eletronicos(){

	}

	public Eletronicos(String cor, double largura,double altura, double cod, int volume){


		this.cor=cor;
		this.altura=altura;
		this.largura=largura;
		this.cod=cod;
		this.volume=volume;

	}
	
	public String getCor(){
		return cor;

	}

	public void setCor(String cor){
		this.cor = cor;

	}


	public double getAltura(){
		return altura;

	}

	public void setAltura(double altura){
		this.altura = altura;

	}

	public double getLargura(){
		return largura;

	}

	public void setLargura(double largura){
		this.largura = largura;

	}

	public double getCod(){
		return cod;

	}

	public void setCod(double cod) {
		this.cod = cod;

	}


	public int getVolume(){
		return volume;

	}

	public void setVolume(int volume) {
		this.volume = volume;

	}

	public void ligar() {
		System.out.println("ligado");

	}

	public void desligar(){
		System.out.println("desligado");

	}

	public int aumentarsom(int getvolume){
		return getvolume;

	}


	public int mostrarcodigo(int getcod){
		return getcod;

	}

	public String mostrarcor(String cor){
		return getCor();

	}

	public double mostrarlargura(double largura){
		return getLargura();

	}

	public double mostraraltura(double altura){
		return getAltura();

	}



}





