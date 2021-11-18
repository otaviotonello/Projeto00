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
		listaAnimais.add("Le�o");
		listaAnimais.add("Cobra Sucuri");
		listaAnimais.add("Pica Pau Parnaiba");
		listaAnimais.add("Arara Azul");
		listaAnimais.add("Cascavel");
		listaAnimais.add("Reptilianos");
		
		////////////////////////////ENTRADA DO PROGRAMA////////////////////////////////////
		
		System.out.println("Ol�! Seja muito Bem Vindo(a) ao Projeto Zoo :)");
		System.out.println("A nossa miss�o � ser um canal de informa��o sobre o mundo animal!");
		System.out.println("\nAqui est� nossa lista de animais dispon�veis para consulta: ");
		System.out.println(listaAnimais);
		System.out.println("\nDigite o nome de um animal dispon�vel: ");
		entrada = in.next();
	
		//////////////////////////SETANDO DO PROGRAMA//////////////////////////////

		//INSETOS
		
		//Cerambicideo Gigante
		
		Cerambicideo_gigante cg = new Cerambicideo_gigante();
		cg.setNome("Cerambicideo");
		cg.setExpcVida(150);
		cg.setHabitat("Terrestre");
		cg.setExtincao(false);
		cg.setPesoMax(300);
		cg.setTamanhoMax(20);
		cg.setVenenoso(false);
		cg.setComida("Madeira em decomposi��o");
		
		//Opiliao
		
		Opiliao op = new Opiliao();
		op.setNome("Opili�o");
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
		
		lion.setNome("Le�o");
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
		snake.setHabitat("terrestre/aqu�tico");
		snake.setExtincao(false);
		snake.setPesoMax(200);
		snake.setTamanhoMax(800);
		snake.setComida("animais de pequeno e medio porte");
		
		/////////MAMIFEROS

		//TAMANDUA
		
		TamanduaBandeira tb = new TamanduaBandeira();
		
		tb.setNome("Tamandu�-Bandeira");
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
		tc.setComida("Aranhas e Escorpi�es");
		
		///////////////////////////////IF/ELSE IF//////////////////////////////////////////
		
		///////////////MAMIFEROS
		
		if(entrada.equalsIgnoreCase("tamandua") || entrada.equalsIgnoreCase("tamandua bandeira") || entrada.equalsIgnoreCase("tamandua-bandeira")) {
			System.out.println("\n--------------------------------------------------------------------------------");
			System.out.println("\n| Nome: " + tb.getNome() + " \n| Tamanho: " + tb.getTamanhoMax() +
			"\n| Expectativa de Vida: " + tb.getExpcVida() + " \n| Peso M�ximo: " + tb.getNome() + 
			"\n| Amea�ado de Extina��o? - " + tb.isExtincao() + " \n| Habitat Natural: " + tb.getHabitat() + " \n| Alimento Predileto: " +
			tb.getComida());
		} else if (entrada.equalsIgnoreCase("tatu") || entrada.equalsIgnoreCase("tatu canastra") || entrada.equalsIgnoreCase("tatu-canastra") ) {
			System.out.println("\n--------------------------------------------------------------------------------");
			System.out.println("\n| Nome: " + tc.getNome() + " \n| Tamanho: " + tc.getTamanhoMax() +
			"\n| Expectativa de Vida: " + tc.getExpcVida() + " \n| Peso M�ximo: " + tc.getNome() + 
			"\n| Amea�ado de Extina��o? - " + tc.isExtincao() + " \n| Habitat Natural: " + tc.getHabitat() + " \n| Alimento Predileto: " +
			tc.getComida());
		}


		/////////////// REPTIL

		if(entrada.equalsIgnoreCase("Cascavel")){
				System.out.println("nome "+ cas.getNome() + "\nCor " + cas.getCor() + "\nComida favorita : " + cas.getComida()
				+ " \nHabitat natural : " + cas.getHabitat() + "\n expectativa de vida : " + cas.getExpcVida());
		} else if(entrada.equalsIgnoreCase("Reptilianos")){
					System.out.println("nome "+ rep.getNome() + "\nCor " + rep.getCor() + "\nComida favorita : " + rep.getComida()
							+ "\n Habitat natural : " + rep.getHabitat() + "\n expectativa de vida : " +
							rep.getExpcVida()+ "\n o reptiliano est� disfar�ado ?  : " + rep.isDisfarcado());
		}

		
		///////////// CARNIVOROS
		
		if(entrada.equalsIgnoreCase("le�o") || entrada.equalsIgnoreCase("leao")) {
			System.out.println("Nome: " + lion.getNome() + " | Tamanho: " + lion.getTamanhoMax() +
			"\nExpc. Vida: " + lion.getExpcVida() + " | Peso Max: " + lion.getPesoMax() + 
			"\nAmea�ado de Ex: " + lion.isExtincao() + " | Habitat: " + lion.getHabitat() + " | Comida: " +
			lion.getComida());
		} else if (entrada.equalsIgnoreCase("cobra") || entrada.equalsIgnoreCase("cobra sucuri") ) {
			System.out.println("Nome: " + snake.getNome() + " | Tamanho: " + snake.getTamanhoMax() +
			"\nExpc. Vida: " + snake.getExpcVida() + " | Peso Max: " + snake.getPesoMax() + 
			"\nAmea�ado de Ex: " + snake.isExtincao() + " | Habitat: " + snake.getHabitat() + " | Comida: " +
			snake.getComida());
		}
		
		//////////////AVES
		
		if(entrada.equalsIgnoreCase("Arara-Azul")) {
			System.out.println("Nome: " + AA.getNome() + " | Tamanho: " + AA.getTamanhoMax() +
			"\nExpc. Vida: " + AA.getExpcVida() + " | Peso Max: " + AA.getPesoMax() + 
			"\nAmea�ado de Ex: " + AA.isExtincao() + " | Habitat: " + AA.getHabitat() + " | Comida: " +
			AA.getComida());
		} else if (entrada.equalsIgnoreCase("Pica-Pau")) {
			System.out.println("Nome: " + PPP.getNome() + " | Tamanho: " + PPP.getTamanhoMax() +
			"\nExpc. Vida: " + PPP.getExpcVida() + " | Peso Max: " + PPP.getPesoMax() + 
			"\nAmea�ado de Ex: " + PPP.isExtincao() + " | Habitat: " + PPP.getHabitat() + " | Comida: " +
			PPP.getComida());
		}
		
		///////////////INSETOS
		
		//MOSTRANDO INFORMA��ES SOBRE O ANIMAL 1
				
		if(entrada.equalsIgnoreCase("Opilidio")) {
			System.out.println("Nome: " + op.getNome() + " | Tamanho: " + op.getTamanhoMax() +
				"\nExpc. Vida: " + op.getExpcVida() + " | Peso Max: " + op.getPesoMax() + 
				"\nAmea�ado de Ex: " + op.isExtincao() + " | Habitat: " + op.getHabitat() + " | Comida: " +
				op.getComida()+"\n");
		} else if(entrada.equalsIgnoreCase("cerambicideo") || entrada.equalsIgnoreCase("cerambicideo gigante") ){
			System.out.println("Nome: " + cg.getNome() + " | Tamanho: " + cg.getTamanhoMax() +
					"\nExpc. Vida: " + cg.getExpcVida() + " | Peso Max: " + cg.getPesoMax() + 
					"\nAmea�ado de Ex: " + cg.isExtincao() + " | Habitat: " + cg.getHabitat() + " | Comida: " +
					cg.getComida()+"\n");
		}
		
		///////////////////////////////////////////////////////////////////////////////////////////
		
		in.close();
	}

}
