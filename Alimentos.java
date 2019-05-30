package projetoav2;

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


	
	// FUNCIONALIDADES
	
	public String mostrarpeso (String peso)	{
		return getPeso();
	}


	public double mostrarcodigo(double codigodebarras){
		return codigodebarras;
	}

	public String mostrartipo (String tipo)
    {
        return getTipo();
    }

    public void comprarproduto()
    {
    System.out.println("O produto está no carrinho");
    }


}


}
