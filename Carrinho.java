package av2;

import java.util.ArrayList;
import java.util.Scanner;

public class Carrinho extends Produtos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int menu = 0;

		ArrayList<Carrinho> ListCarrinho = new ArrayList<Carrinho>();


		//						MENU

		System.out.print("\n  Bem Vindo ao APSMart \n\n  1 - Ir para o Menu de produtos\n  2 - Acessar meu carrinho\n");

		System.out.print("\n  Escolha uma opcão: ");

		menu = sc.nextInt();

		sc.nextLine();


		switch (menu) {
		case 1: // MENU ELETRONICOS


			System.out.println("1 - Eletrônicos == TV | SOM | SMARTPHONE ==");
			System.out.println("2 - Alimentos == ARROZ| FEIJAO | CARNE ==");
			System.out.println("3 - Higiene == SHAMPOO | SABONETE | CREME DENTAL ==");
			System.out.println("4 - Voltar");


			menu = sc.nextInt();

			sc.nextLine();

			if (menu ==1) {
				
				Eletronicos tv = new Eletronicos();
				tv.setTipo("Tv");
				tv.setCor("Preta");
				tv.setFabricante("Samsung");
				tv.setCod(01);
				tv.setAltura(1.50);
				tv.setLargura(1.32);
				tv.setPreco(1500);
				listEletronicos.add(tv);


				Eletronicos tv2 = new Eletronicos();
				tv2.setTipo("Tv");
				tv2.setCor("Prata");
				tv2.setFabricante("LG");
				tv2.setCod(02);
				tv2.setAltura(1.10);
				tv2.setLargura(1.22);
				tv2.setPreco(1800);
				listEletronicos.add(tv2);
				
				// SOM
				
				Eletronicos xtreme = new Eletronicos();
				xtreme.setTipo("Som");
				xtreme.setCor("vermelho");
				xtreme.setFabricante("LG");
				xtreme.setCod(03);
				xtreme.setAltura(1.8);
				xtreme.setLargura(1.17);
				xtreme.setPreco(1599);
				listEletronicos.add(xtreme);


				Eletronicos xtrememax = new Eletronicos();
				xtrememax.setTipo("Som");
				xtrememax.setCor("Preto");
				xtrememax.setFabricante("Panasonic");
				xtrememax.setCod(04);
				xtrememax.setAltura(1.10);
				xtrememax.setLargura(1.22);
				xtrememax.setPreco(1800);
				listEletronicos.add(xtrememax);
				
				// SMARTPHONE
				
				Eletronicos Galaxy = new Eletronicos();
				Galaxy.setTipo("Smartphone");
				Galaxy.setCor("cinza");
				Galaxy.setFabricante("Samsung");
				Galaxy.setCod(05);
				Galaxy.setAltura(0.75);
				Galaxy.setLargura(0.33);
				Galaxy.setPreco(1000);    
				listEletronicos.add(Galaxy);

				Eletronicos Zplus = new Eletronicos();
				Zplus.setTipo("Smartphone");
				Zplus.setCor("preto");
				Zplus.setFabricante("Motorola");
				Zplus.setCod(06);
				Zplus.setAltura(0.60);
				Zplus.setLargura(0.44);
				Zplus.setPreco(1300);
				listEletronicos.add(Zplus);
				
				
				
				
				for (Eletronicos obj1 : listEletronicos) {

					System.out.println("--------MENU ELETRÔNICOS-------");
					System.out.println("Tipo:  " + obj1.getTipo());
					System.out.println("Cor:  " + obj1.getCor());
					System.out.println("Fabricante:  " + obj1.getFabricante());
					System.out.println("Altura:  " + obj1.getAltura());
					System.out.println("Largura:  " + obj1.getLargura());
					System.out.println("Preço:  " + obj1.getPreco());
					System.out.println("Nºserie:  " + obj1.getCod());
					System.out.println("--------------------------------");

					
				}
		

				System.out.println("Digite o codigo do produto que deseja comprar:");

				menu = sc.nextInt();

				sc.nextLine();

				// ListCarrinho.add();

				break;

			}

			if (menu ==2) {
				
					// ARROZ
				
					Alimentos Arroz = new Alimentos();
					Arroz.setTipo("Arroz branco");
					Arroz.setPeso("1.5kg");
					Arroz.setCodigodebarras(002);
					Arroz.setFabricante("AMIL");
					Arroz.setPreco(5.00);
					ListAlimentos.add(Arroz);


					Alimentos ArrozArbóreo = new Alimentos();
					ArrozArbóreo.setTipo("Arroz Arboreo");
					ArrozArbóreo.setPeso("1.5kg");
					ArrozArbóreo.setFabricante("RR Arroz");
					ArrozArbóreo.setCodigodebarras(002);
					ArrozArbóreo.setPreco(5.30);
					ListAlimentos.add(ArrozArbóreo);
					
					// FEIJAO
					Alimentos feijao= new Alimentos();
					feijao.setTipo(" Feijao macassar");
					feijao.setPeso("1kg");
					feijao.setFabricante("Turquesa");
					feijao.setCodigodebarras(001);
					feijao.setPreco(7.00);
					ListAlimentos.add(feijao);

					Alimentos feijaoPreto = new Alimentos();
					feijaoPreto.setTipo("Feijao Preto");
					feijaoPreto.setPeso("1Kg");
					feijaoPreto.setFabricante("KI CALDO");
					feijaoPreto.setCodigodebarras(001);
					feijaoPreto.setPreco(7.20);
					ListAlimentos.add(feijaoPreto);
					
					// CARNE
					Alimentos Picanha = new Alimentos();
					Picanha.setTipo("Picanha");
					Picanha.setPeso("2kg");
					Picanha.setCodigodebarras(003);
					Picanha.setFabricante("Friboi");
					Picanha.setPreco(45.00);
					ListAlimentos.add(Picanha);


					Alimentos Maminha= new Alimentos();
					Maminha.setTipo("Maminha");
					Maminha.setPeso("1kg");
					Maminha.setCodigodebarras(003);
					Maminha.setFabricante("Masterboi");
					Maminha.setPreco(25.00);
					ListAlimentos.add(Maminha);
					
					for (Alimentos obj2 : ListAlimentos) {

						System.out.println("--------MENU ALIMENTOS-------");
						System.out.println("Tipo:  " + obj2.getTipo());
						System.out.println("Fabricante:  " + obj2.getFabricante());
						System.out.println("Cor:  " + obj2.getPeso());
						System.out.println("Preço:  " + obj2.getPreco());
						System.out.println("Nºserie:  " + obj2.getCodigodebarras());
						System.out.println("--------------------------------");

						
					}
					
					
					
				
				
			}

			System.out.println("Digite o codigo do produto que deseja comprar:");

			menu = sc.nextInt();

			sc.nextLine();

			//     ListCarrinho.add;





			if (menu ==3) {


			}

			System.out.println("Digite o codigo do produto que deseja comprar:");

			menu = sc.nextInt();

			sc.nextLine();



			if (menu ==4) {



			}


		}
	}
}


