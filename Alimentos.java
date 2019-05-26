package av2;

public class Alimentos {
	private String tipo;
	private String fabricante;
	private String peso;
	private double codigodebarras;
	private double preço;

	public Alimentos()
	{

	}

	public Alimentos(String tipo,String fabricante,String peso,double codigodebarras,double preço)
	{
		this.tipo=tipo;
		this.fabricante=fabricante;
		this.peso=peso;
		this.codigodebarras=codigodebarras;
		this.preço=preço;
	}

	public String getTipo() { return tipo; }

	public void setTipo(String tipo) { this.tipo = tipo; }

	public String getFabricante() { return fabricante; }

	public void setFabricante(String fabricante) { this.fabricante = fabricante; }

	public String getPeso() { return peso; }

	public void setPeso(String peso) { this.peso = peso; }

	public double getCodigodebarras() { return codigodebarras;}

	public void setCodigodebarras(double codigodebarras) { this.codigodebarras = codigodebarras; }

	public double getPreço() { return preço; }

	public void setPreço(double preço) { this.preço = preço; }


	public String mostrarpeso (String peso)
	{
		return getPeso();
	}

	public String mostrartipo (String tipo)
	{
		return getTipo();
	}

	public double mostrarcodigo(double codigodebarras)
	{
		return codigodebarras;
	}

	public double mostrarpreço (double preço)
	{
		return getPreço();
	}

	public void comprarproduto()
	{
		System.out.println("O produto está no carrinho");
	}

}