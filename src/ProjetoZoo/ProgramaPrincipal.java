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
		
		////////////////////////////ENTRADA DO PROGRAMA//////////////////////////////////////
		
		System.out.println("Olá! Seja muito Bem Vindo(a) ao Projeto Zoo :)");
		System.out.println("A nossa missão é ser um canal de informação sobre o mundo animal!");
		System.out.println("\nAqui está nossa lista de animais disponíveis para consulta: ");
		System.out.println(listaAnimais);
		System.out.println("\nDigite o nome de um animal disponível: ");
		entrada = in.next();
	
		//////////////////////////ESTRUTURA CENTRAL DO PROGRAMA//////////////////////////////
		
		//MAMIFEROS

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
		
		//////////////////////////////////////////////
		if(entrada.equalsIgnoreCase("tamandua") || entrada.equalsIgnoreCase("tamandua bandeira")) {
			System.out.println("\n--------------------------------------------------------------------------------");
			System.out.println("\n| Nome: " + tb.getNome() + " \n| Tamanho: " + tb.getTamanhoMax() +
			"\n| Expectativa de Vida: " + tb.getExpcVida() + " \n| Peso Máximo: " + tb.getNome() + 
			"\n| Ameaçado de Extinação? - " + tb.isExtincao() + " \n| Habitat Natural: " + tb.getHabitat() + " \n| Alimento Predileto: " +
			tb.getComida());
			} else if (entrada.equalsIgnoreCase("tatu") || entrada.equalsIgnoreCase("tatu canastra") ) {
			System.out.println("\n--------------------------------------------------------------------------------");
			System.out.println("\n| Nome: " + tc.getNome() + " \n| Tamanho: " + tc.getTamanhoMax() +
			"\n| Expectativa de Vida: " + tc.getExpcVida() + " \n| Peso Máximo: " + tc.getNome() + 
			"\n| Ameaçado de Extinação? - " + tc.isExtincao() + " \n| Habitat Natural: " + tc.getHabitat() + " \n| Alimento Predileto: " +
			tc.getComida());
			}
		/////////////////////////////////////////////
		
		//OPTIONS
		
		//EXCEPTIONS
		
		////////////////////////////////////////////
		in.close();
	}

}
