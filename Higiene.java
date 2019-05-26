package av2;

public class Higiene {
	private String tipo;
	private String nome;
	private float pesoliquido;
	private double coddebarras;
	private String fabricante;
	private double preço;

	public Higiene(){

	}

	public Higiene(String tipo,String nome,float pesoliquido,double coddebarras,String fabricante,double preço)
	{
		this.tipo=tipo;
		this.nome=nome;
		this.pesoliquido=pesoliquido;
		this.coddebarras=coddebarras;
		this.fabricante=fabricante;
		this.preço=preço;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
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

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public double getPreço() {
		return preço;
	}

	public void setPreço(double preço) {
		this.preço = preço;
	}


	public float mostrarML(float pesoliquido)
	{
		return getPesoliquido();
	}
	public double mostrarcod(double coddebarras)
	{
		return getCoddebarras();
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