package projetoav2;

public class Eletronicos extends Produtos{

	private String cor;
	private String largura;
	private String altura;
	private double cod;
	private int volume;
	
	
	public String showProduto() {
		return "TV" + fabricante + "com " + largura + "de largura" + " " + altura + " de altura" + " "+"código" + cod;
		
	}
	

	public Eletronicos(){

	}

	public Eletronicos(String cor, String largura,String altura, double cod, int volume){


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


	public String getAltura(){
		return altura;

	}

	public void setAltura(String altura){
		this.altura = altura;

	}

	public String getLargura(){
		return largura;

	}

	public void setLargura(String largura){
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

	
	// funcionalidades
	
	public boolean ligar (boolean status)
    {
        System.out.println("Ligado");
        return status==true;
    }
	
	 public boolean desligar (boolean status)
     {
     System.out.println("desligado");
     return status;
     }

     public void aumentarVolume(int volume)
     {
         volume++;
         System.out.println(volume);
     }


     public void diminuirVolume (int volume)
     {
         if (volume!=0) {
    	 volume--;
         }
         else { 
        	 System.out.println("O volume é 0");
         		}
         
       System.out.println(volume);
     }


     public int mostrarcodigo(int getcod){
		return getcod;

	}

	public String mostrarcor(String cor){
		return getCor();

	}

	public String mostrarlargura(String largura){
		return getLargura();

	}

	public String mostraraltura(String altura){
		return getAltura();

	}

	public void comprou()
 	{
		
 	}

}



