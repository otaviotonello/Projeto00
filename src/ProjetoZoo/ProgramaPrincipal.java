package ProjetoZoo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		String entrada;
		Scanner in = new Scanner(System.in);
		
		//COLLECTIONS
		
		List<String> listaAnimais = new ArrayList<>();
		listaAnimais.add("Tatu-Canastra");
		listaAnimais.add("Tamandua-Bandeira");
		listaAnimais.add("Leão");
		listaAnimais.add("Cobra Sucuri");
		listaAnimais.add("Pica Pau Parnaiba");
		listaAnimais.add("Arara Azul");
		listaAnimais.add("Cascavel");
		listaAnimais.add("Reptilianos");
		listaAnimais.add("Opilideo");
		listaAnimais.add("Cerambicideo Gigante");
		
		////////////////////////////ENTRADA DO PROGRAMA////////////////////////////////////
		
		System.out.println("Olá! Seja muito Bem Vindo(a) ao Projeto Zoo :)");
		System.out.println("A nossa missão é ser um canal de informação sobre o mundo animal!");
		System.out.println("\nAqui está nossa lista de animais disponíveis para consulta: ");
		System.out.println(listaAnimais);
		System.out.println("\nDigite o nome de um animal disponível: ");
		entrada = in.next();
	
		//////////////////////////SETANDO DO PROGRAMA//////////////////////////////
		
		/////////// HEBIVERO

				// CAVALO

				Cavalo cavalo1 = new Cavalo();

				cavalo1.setNome("Cavalo1");
				cavalo1.setExpcVida(30);
				cavalo1.setHabitat("terrestre");
				cavalo1.setExtincao(false);
				cavalo1.setPesoMax(400);
				cavalo1.setTamanhoMax(2);
				cavalo1.setComida("Planta");

				// VACA

				Vaca vaca1 = new Vaca();

				vaca1.setNome("Vaca1");
				vaca1.setExpcVida(22);
				vaca1.setHabitat("terrestre");
				vaca1.setExtincao(false);
				vaca1.setPesoMax(700);
				vaca1.setTamanhoMax(1.4);
				vaca1.setComida("Planta");
		
			
		////////////////INSETOS
		
		//Cerambicideo Gigante
		
			Cerambicideo_gigante cg = new Cerambicideo_gigante();
			cg.setNome("Cerambicideo");
			cg.setExpcVida(150);
			cg.setHabitat("Terrestre");
			cg.setExtincao(false);
			cg.setPesoMax(300);
			cg.setTamanhoMax(20);
			cg.setVenenoso(false);
			cg.setComida("Madeira em decomposição");
			
			//Opiliao
			
			Opiliao op = new Opiliao();
			op.setNome("Opilião");
			op.setExpcVida(76);
			op.setHabitat("Terrestre");
			op.setExtincao(true);
			op.setPesoMax(0);
			op.setTamanhoMax(5);
			op.setVenenoso(false);
			op.setComida("Pequenos invertebrados");
		
		//////////////REPTIL
		
			//Cascavel
			Cascavel cas = new Cascavel();
			cas.setVeneno(true);
			cas.setComida("animais pequenos");
			cas.setNome("carlas a cobra");
			cas.setExpcVida(65);
			cas.setCor("verde");
			cas.setHabitat("Qualquer floresta");
			
			//Reptilianos
			
			Repetilianos rep = new Repetilianos();
			rep.setNome("Michael jackson");
			rep.setComida("Doritos e bolo");
			rep.setExpcVida(350);
			rep.setExtincao(false);
			rep.setHabitat("Alta sociedade");
			rep.setVeneno(true);
			rep.setCor("verde");
			rep.setDisfarcado(true);
		
		/////////////AVES
		
			//ARARA-AZUL
			
			AraraAzul AA = new AraraAzul();
			
			AA.setNome("Arara-Azul");
			AA.setExpcVida(50);
			AA.setHabitat("terrestre");
			AA.setExtincao(true);
			AA.setPesoMax(1.3);
			AA.setTamanhoMax(100);
			AA.setComida("Sementes");
			
			
			//Pica-pau-do-parnaiba
			
			PicaPauParnaiba PPP = new PicaPauParnaiba();
			
			PPP.setNome("Pica-pau-do-parnaiba");
			PPP.setExpcVida(15);
			PPP.setHabitat("terrestre");
			PPP.setExtincao(true);
			PPP.setPesoMax(95);
			PPP.setTamanhoMax(27);
			PPP.setComida("Insetos");
		
		///////////CARNIVOROS
	
			//LEAO
			
			Leao lion = new Leao();
			
			lion.setNome("Leão");
			lion.setExpcVida(15);
			lion.setHabitat("terrestre");
			lion.setExtincao(false);
			lion.setPesoMax(190);
			lion.setTamanhoMax(120);
			lion.setComida("outros animais");
			
			
			//COBRA
			
			CobraSucuri snake = new CobraSucuri();
			
			snake.setNome("Cobra-sucuri");
			snake.setExpcVida(15);
			snake.setHabitat("terrestre/aquático");
			snake.setExtincao(false);
			snake.setPesoMax(200);
			snake.setTamanhoMax(800);
			snake.setComida("animais de pequeno e medio porte");
		
		/////////MAMIFEROS
	
			//TAMANDUA
			
			TamanduaBandeira tb = new TamanduaBandeira();
			
			tb.setNome("Tamanduá-Bandeira");
			tb.setExpcVida(12);
			tb.setHabitat("terrestre");
			tb.setExtincao(true);
			tb.setPesoMax(43);
			tb.setTamanhoMax(110);
			tb.setComida("Formiga");
			
			//TATU
			
			TatuCanastra tc = new TatuCanastra();
			
			tc.setNome("Tatu-Canastra");
			tc.setExpcVida(15);
			tc.setHabitat("Terrestre");
			tc.setExtincao(true);
			tc.setPesoMax(33);
			tc.setTamanhoMax(100);
			tc.setComida("Aranhas e Escorpiões");
			
		///////////////////////////////IF/ELSE IF//////////////////////////////////////////
		
		///////////////MAMIFEROS
		
			if(entrada.equalsIgnoreCase("tamandua") || entrada.equalsIgnoreCase("tamandua bandeira") || entrada.equalsIgnoreCase("tamandua-bandeira")) {
				System.out.println("\n--------------------------------------------------------------------------------");
				System.out.println("\n| Nome: " + tb.getNome() + " \n| Tamanho: " + tb.getTamanhoMax() +
				"\n| Expectativa de Vida: " + tb.getExpcVida() + " \n| Peso Máximo: " + tb.getNome() + 
				"\n| Ameaçado de Extinação? - " + tb.isExtincao() + " \n| Habitat Natural: " + tb.getHabitat() + " \n| Alimento Predileto: " +
				tb.getComida());
				
				System.out.println("\n--------------------------------------------------------------------------------");

				tb.som();
				tb.alimentar();

			} else if (entrada.equalsIgnoreCase("tatu") || entrada.equalsIgnoreCase("tatu canastra") || entrada.equalsIgnoreCase("tatu-canastra") ) {
				System.out.println("\n--------------------------------------------------------------------------------");
				System.out.println("\n| Nome: " + tc.getNome() + " \n| Tamanho: " + tc.getTamanhoMax() +
				"\n| Expectativa de Vida: " + tc.getExpcVida() + " \n| Peso Máximo: " + tc.getNome() + 
				"\n| Ameaçado de Extinação? - " + tc.isExtincao() + " \n| Habitat Natural: " + tc.getHabitat() + " \n| Alimento Predileto: " +
				tc.getComida());
				
				System.out.println("\n--------------------------------------------------------------------------------");

				tc.som();
				tc.alimentar();
				
			}
			
		/////////////// REPTIL

				if(entrada.equalsIgnoreCase("Cascavel")){
						System.out.println("nome "+ cas.getNome() + "\nCor " + cas.getCor() + "\nComida favorita : " + cas.getComida()
						+ " \nHabitat natural : " + cas.getHabitat() + "\n expectativa de vida : " + cas.getExpcVida());
					
					System.out.println("\n--------------------------------------------------------------------------------");
	
					cas.som();
					cas.alimentar();
					
				} else if(entrada.equalsIgnoreCase("Reptilianos")){
						System.out.println("nome "+ rep.getNome() + "\nCor " + rep.getCor() + "\nComida favorita : " + rep.getComida()
						+ "\n Habitat natural : " + rep.getHabitat() + "\n expectativa de vida : " +
						rep.getExpcVida()+ "\n o reptiliano está disfarçado ?  : " + rep.isDisfarcado());
					
					System.out.println("\n--------------------------------------------------------------------------------");
		
					rep.som();
					rep.alimentar();
				}
		
		///////////// CARNIVOROS
		
				if(entrada.equalsIgnoreCase("leão") || entrada.equalsIgnoreCase("leao")) {
					System.out.println("Nome: " + lion.getNome() + " | Tamanho: " + lion.getTamanhoMax() +
					"\nExpc. Vida: " + lion.getExpcVida() + " | Peso Max: " + lion.getPesoMax() + 
					"\nAmeaçado de Ex: " + lion.isExtincao() + " | Habitat: " + lion.getHabitat() + " | Comida: " +
					lion.getComida());
					
					System.out.println("\n--------------------------------------------------------------------------------");

					lion.som();
					lion.alimentar();
					
				} else if (entrada.equalsIgnoreCase("cobra") || entrada.equalsIgnoreCase("cobra sucuri") ) {
					System.out.println("Nome: " + snake.getNome() + " | Tamanho: " + snake.getTamanhoMax() +
					"\nExpc. Vida: " + snake.getExpcVida() + " | Peso Max: " + snake.getPesoMax() + 
					"\nAmeaçado de Ex: " + snake.isExtincao() + " | Habitat: " + snake.getHabitat() + " | Comida: " +
					snake.getComida());
					
					System.out.println("\n--------------------------------------------------------------------------------");

					snake.som();
					snake.alimentar();
				}
			
		//////////////AVES
		
				if(entrada.equalsIgnoreCase("Arara-Azul") ||entrada.equalsIgnoreCase("Arara")) {
					System.out.println("Nome: " + AA.getNome() + " | Tamanho: " + AA.getTamanhoMax() +
					"\nExpc. Vida: " + AA.getExpcVida() + " | Peso Max: " + AA.getPesoMax() + 
					"\nAmeaçado de Ex: " + AA.isExtincao() + " | Habitat: " + AA.getHabitat() + " | Comida: " +
					AA.getComida());
					
					System.out.println("\n--------------------------------------------------------------------------------");

					AA.alimentar();
					AA.som();
					
				} else if (entrada.equalsIgnoreCase("Pica-Pau")) {
					System.out.println("Nome: " + PPP.getNome() + " | Tamanho: " + PPP.getTamanhoMax() +
					"\nExpc. Vida: " + PPP.getExpcVida() + " | Peso Max: " + PPP.getPesoMax() + 
					"\nAmeaçado de Ex: " + PPP.isExtincao() + " | Habitat: " + PPP.getHabitat() + " | Comida: " +
					PPP.getComida());
					
					System.out.println("\n--------------------------------------------------------------------------------");

					PPP.som();
					PPP.alimentar();
				}
			
		///////////////INSETOS
				
				if(entrada.equalsIgnoreCase("Opilidio")) {
					System.out.println("Nome: " + op.getNome() + " | Tamanho: " + op.getTamanhoMax() +
						"\nExpc. Vida: " + op.getExpcVida() + " | Peso Max: " + op.getPesoMax() + 
						"\nAmeaçado de Ex: " + op.isExtincao() + " | Habitat: " + op.getHabitat() + " | Comida: " +
						op.getComida()+"\n");
					
					System.out.println("\n--------------------------------------------------------------------------------");

					op.alimentar();
					op.som();
					
				} else if(entrada.equalsIgnoreCase("cerambicideo") || entrada.equalsIgnoreCase("cerambicideo gigante") ){
					System.out.println("Nome: " + cg.getNome() + " | Tamanho: " + cg.getTamanhoMax() +
							"\nExpc. Vida: " + cg.getExpcVida() + " | Peso Max: " + cg.getPesoMax() + 
							"\nAmeaçado de Ex: " + cg.isExtincao() + " | Habitat: " + cg.getHabitat() + " | Comida: " +
							cg.getComida()+"\n");
					System.out.println("\n--------------------------------------------------------------------------------");
					cg.som();
					cg.alimentar();
				}
			
		////////////// HERBIVOROS
			
				if (entrada.equalsIgnoreCase("cavalo") || entrada.equalsIgnoreCase("cavalo")) {
						System.out.println("\n--------------------------------------------------------------------------------");
						System.out.println("\n| Nome: " + cavalo1.getNome() + " \n| Tamanho: " + cavalo1.getTamanhoMax()
						+ "\n| Expectativa de Vida: " + cavalo1.getExpcVida() + " \n| Peso Máximo: " + cavalo1.getPesoMax()
						+ "\n| Ameaçado de Extinação? - " + cavalo1.isExtincao() + " \n| Habitat Natural: " + cavalo1.getHabitat()
						+ " \n| Alimento Predileto: " + cavalo1.getComida());			
					System.out.println("\n--------------------------------------------------------------------------------");
					cavalo1.som();
					cavalo1.alimentar();
					
				} else if (entrada.equalsIgnoreCase("vaca") || entrada.equalsIgnoreCase("vaca")) {
						System.out.println("\n--------------------------------------------------------------------------------");
						System.out.println("\n| Nome: " + vaca1.getNome() + " \n| Tamanho: " + vaca1.getTamanhoMax()
						+ "\n| Expectativa de Vida: " + vaca1.getExpcVida() + " \n| Peso Máximo: " + vaca1.getPesoMax()
						+ "\n| Ameaçado de Extinação? - " + vaca1.isExtincao() + " \n| Habitat Natural: " + vaca1.getHabitat()
						+ " \n| Alimento Predileto: " + vaca1.getComida());
					System.out.println("\n--------------------------------------------------------------------------------");
					vaca1.som();
					vaca1.alimentar();
				}
			
		///////////////////////////////////////////////////////////////////////////////////////////
		
		in.close();
	}

}
