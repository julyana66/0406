package av2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main{
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int menu;
		
		ArrayList<Eletronicos> listEletronicos = new ArrayList<Eletronicos>();
		ArrayList<Alimentos> ListAlimentos = new ArrayList<Alimentos>();
		ArrayList<Higiene> ListHigiene = new ArrayList<Higiene>();
		ArrayList<Carrinho> ListCarrinho = new ArrayList<Carrinho>(10);
		

			System.out.println("====== APSMART COMPRAS ======");
			System.out.println("Acesse nosso menu e escolha seus produtos");
			System.out.println("ou consulte seu carrinho de compras");
			System.out.println("1 - Produtos Eletrônicos");
			System.out.println("2 - Produtos de Alimentos");
			System.out.println("3 - Produtos de Higiene");
			System.out.println("4 - carrinho de compras ");
		
			menu = sc.nextInt ();
			sc.hasNextLine();
			
	
			// eletronicos
			
			if (menu == 1) {
				// tv
				
				Eletronicos tv = new Eletronicos();
				tv.setTipo("Tv");
				tv.setCor("Preta");
				tv.setFabricante("Samsung");
				tv.setCod(01);
				tv.setAltura(1.50);
				tv.setLargura(1.32);
				tv.setPreço(1500);
				listEletronicos.add(tv);


				Eletronicos tv2 = new Eletronicos();
				tv2.setTipo("Tv");
				tv2.setCor("Prata");
				tv2.setFabricante("LG");
				tv2.setCod(02);
				tv2.setAltura(1.10);
				tv2.setLargura(1.22);
				tv2.setPreço(1800);
				listEletronicos.add(tv2);
				
				// som
				Eletronicos xtreme = new Eletronicos();
				xtreme.setTipo("Som");
				xtreme.setCor("vermelho");
				xtreme.setFabricante("LG");
				xtreme.setCod(03);
				xtreme.setAltura(1.8);
				xtreme.setLargura(1.17);
				xtreme.setPreço(1599);
				listEletronicos.add(xtreme);

				
				Eletronicos xtrememax = new Eletronicos();
				xtrememax.setTipo("Som");
				xtrememax.setCor("Preto");
				xtrememax.setFabricante("Panasonic");
				xtrememax.setCod(04);
				xtrememax.setAltura(1.10);
				xtrememax.setLargura(1.22);
				xtrememax.setPreço(1800);
				listEletronicos.add(xtrememax);
				
				//Smartphone
				Eletronicos Galaxy = new Eletronicos();
				Galaxy.setTipo("Smartphone");
				Galaxy.setCor("cinza");
				Galaxy.setFabricante("Samsung");
				Galaxy.setCod(05);
				Galaxy.setAltura(0.75);
				Galaxy.setLargura(0.33);
				Galaxy.setPreço(1000);    
				listEletronicos.add(Galaxy);

				Eletronicos Zplus = new Eletronicos();
				Zplus.setTipo("Smartphone");
				Zplus.setCor("preto");
				Zplus.setFabricante("Motorola");
				Zplus.setCod(06);
				Zplus.setAltura(0.60);
				Zplus.setLargura(0.44);
				Zplus.setPreço(1300);
				listEletronicos.add(Zplus);
			}
			

			for (Eletronicos obj1 : listEletronicos) {

				System.out.println("--------MENU ELETRÔNICOS-------");
				System.out.println("Tipo:  " + obj1.getTipo());
				System.out.println("Cor:  " + obj1.getCor());
				System.out.println("Fabricante:  " + obj1.getFabricante());
				System.out.println("Altura:  " + obj1.getAltura());
				System.out.println("Largura:  " + obj1.getLargura());
				System.out.println("Preço:  " + obj1.getPreço());
				System.out.println("Nºserie:  " + obj1.getCod());
				System.out.println("--------------------------------");

			}


			Eletronicos c = new Eletronicos();
			System.out.println("digite o cod do produto que deseja comprar:");
			sc.nextInt();
			c.comprarproduto();



			if (menu == 2) {
				Alimentos feijão= new Alimentos();
				feijão.setTipo(" Feijão macassar");
				feijão.setPeso("1kg");
				feijão.setFabricante("Turquesa");
				feijão.setCodigodebarras(001);
				feijão.setPreço(7.00);
				ListAlimentos.add(feijão);
				
				Alimentos feijãoPreto = new Alimentos();
				feijãoPreto.setTipo("Feijão Preto");
				feijãoPreto.setPeso("1Kg");
				feijãoPreto.setFabricante("KI CALDO");
				feijãoPreto.setCodigodebarras(001);
				feijãoPreto.setPreço(7.20);
				ListAlimentos.add(feijãoPreto);
				
				
				Alimentos Arroz = new Alimentos();
				Arroz.setTipo("Arroz branco");
				Arroz.setPeso("1.5kg");
				Arroz.setCodigodebarras(002);
				Arroz.setFabricante("AMIL");
				Arroz.setPreço(5.00);
				ListAlimentos.add(Arroz);
				
				
				Alimentos ArrozArbóreo = new Alimentos();
				ArrozArbóreo.setTipo("Arroz Arbóreo");
				ArrozArbóreo.setPeso("1.5kg");
				ArrozArbóreo.setFabricante("RR Arroz");
				ArrozArbóreo.setCodigodebarras(002);
				ArrozArbóreo.setPreço(5.30);
				ListAlimentos.add(ArrozArbóreo);
				
				
				Alimentos Picanha = new Alimentos();
				Picanha.setTipo("Picanha");
				Picanha.setPeso("2kg");
				Picanha.setCodigodebarras(003);
				Picanha.setFabricante("Friboi");
				Picanha.setPreço(45.00);
				ListAlimentos.add(Picanha);
				
				
				Alimentos Maminha= new Alimentos();
				Maminha.setTipo("Maminha");
				Maminha.setPeso("1kg");
				Maminha.setCodigodebarras(003);
				Maminha.setFabricante("Masterboi");
				Maminha.setPreço(25.00);
				ListAlimentos.add(Maminha);
			}

				for (Alimentos obj2 : ListAlimentos) {
					System.out.println("--------MENU ALIMENTOS-------");
					System.out.println("Tipo:  " + obj2.getTipo());
					System.out.println("Fabricante  :" + obj2.getFabricante());
					System.out.println("Peso: "+obj2.getPeso());
					System.out.println(("Preço:  " + obj2.getPreço()));
					System.out.println("Codigo de barras:  " + obj2.getCodigodebarras());
					System.out.println("------------------------------");

				}
				

				Alimentos b = new Alimentos();
				System.out.println("digite o cod do produto que deseja comprar?");
				sc.nextInt();
				b.comprarproduto();

				if(menu==3){

					Higiene dove = new Higiene();
					dove.setTipo("Sabonete");
					dove.setFabricante("Dove");
					dove.setCoddebarras(0001);
					dove.setPesoliquido(30);
					dove.setPreço(1.00);
					ListHigiene.add(dove);
					
					Higiene even = new Higiene();
					even.setTipo("Sabonete");
					even.setFabricante("Even");
					even.setCoddebarras(0001);
					even.setPesoliquido(25);
					even.setPreço(0.95);
					ListHigiene.add(even);
					
					Higiene colgate = new Higiene();
					colgate.setTipo("Creme dental");
					colgate.setFabricante("colgate");
					colgate.setCoddebarras(0002);
					colgate.setPesoliquido(15);
					colgate.setPreço(1.20);
					ListHigiene.add(colgate);
					
					Higiene OralB = new Higiene();
					OralB.setTipo("Creme dental");
					OralB.setFabricante("ORAL B");
					OralB.setCoddebarras(0002);
					OralB.setPesoliquido(15);
					OralB.setPreço(1.10);
					ListHigiene.add(OralB);
					
					Higiene Seda = new Higiene();
					Seda.setTipo("Shampoo");
					Seda.setFabricante("Seda");
					Seda.setCoddebarras(0003);
					Seda.setPesoliquido(500);
					Seda.setPreço(4.60);
					ListHigiene.add(Seda);
					
					Higiene Treseme= new Higiene();
					Treseme.setTipo("Shampoo");
					Treseme.setFabricante("Tresemé");
					Treseme.setCoddebarras(0003);
					Treseme.setPesoliquido(800);
					ListHigiene.add(Treseme);
				}

					for (Higiene obj3 : ListHigiene) {
						System.out.println("--------MENU HIGIÊNE-------");
						System.out.println("Tipo:  " + obj3.getTipo());
						System.out.println("Fabricante:  " + obj3.getFabricante());
						System.out.println("Peso:  " + obj3.getPesoliquido());
						System.out.println(("Preço:  " + obj3.getPreço()));
						System.out.println("Codigo de barras:  " + obj3.getCoddebarras());
						System.out.println("---------------------------");

					}
					
					Higiene d = new Higiene();
					System.out.println("digite o cod do produto que deseja comprar!");
					sc.nextInt();
					d.comprarproduto();

				
					listEletronicos.size();
			
			}
}
		