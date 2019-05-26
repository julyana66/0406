package av2;

public class Eletronicos {
	private String tipo;
	private String cor;
	private String fabricante;
	private double largura;
	private double altura;
	private double cod;
	private double preço;
	private int volume;

	public Eletronicos()
	{

	}

	public Eletronicos(String tipo,String cor, String fabricante, double largura,double altura, double cod, double preço)
	{
		this.tipo=tipo;
		this.cor=cor;
		this.fabricante=fabricante;
		this.altura=altura;
		this.largura=largura;
		this.cod=cod;
		this.preço=preço;
	}



	public String getTipo()
	{
		return tipo;
	}

	public void setTipo(String tipo)
	{
		this.tipo = tipo;
	}

	public String getCor()
	{
		return cor;
	}

	public void setCor(String cor)
	{
		this.cor = cor;
	}

	public String getFabricante()
	{
		return fabricante;
	}

	public void setFabricante(String fabricante)
	{
		this.fabricante = fabricante;
	}

	public double getAltura()
	{
		return altura;
	}

	public void setAltura(double altura)
	{
		this.altura = altura;
	}

	public double getLargura()
	{
		return largura;
	}

	public void setLargura(double largura)
	{
		this.largura = largura;
	}

	public double getCod()
	{
		return cod;
	}

	public void setCod(double cod)
	{
		this.cod = cod;
	}

	public double getPreço()
	{
		return preço;
	}

	public void setPreço(double preço)
	{
		this.preço = preço;
	}

	public int getVolume()
	{
		return volume;
	}

	public void setVolume(int volume)
	{
		this.volume = volume;
	}

	public void ligar()
	{
		System.out.println("ligado");
	}
	public void desligar()
	{
		System.out.println("desligado");
	}
	public int aumentarsom(int getvolume)
	{
		return getvolume;
	}
	public void ligação()
	{


	}
	public void mudarcanal()
	{

	}
	public void mudarestação()
	{

	}
	public int mostrarcodigo(int getcod)
	{
		return getcod;
	}

	public String mostrarcor(String cor)
	{
		return getCor();
	}
	public double mostrarlargura(double largura)
	{
		return getLargura();
	}
	public double mostraraltura(double altura)
	{
		return getAltura();
	}
	public double mostrarpreço(double preço)
	{
		return getPreço();
	}
	public void comprarproduto()
	{
		System.out.println("O produto está no carrinho");
	}


}
