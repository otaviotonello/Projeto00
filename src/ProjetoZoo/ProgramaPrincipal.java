package ProjetoZoo;

import java.util.Scanner;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		String entrada;
		Scanner in = new Scanner(System.in);
		System.out.println("Digite o nome de um Animal: ");
		entrada = in.next();
	
		////////////////////////////////////////////////
		
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
		tc.setHabitat("terrestre");
		tc.setExtincao(true);
		tc.setPesoMax(33);
		tc.setTamanhoMax(100);
		tc.setComida("Aranhas e escorpiões");
		
		//////////////////////////////////////////////
		
		if(entrada.equalsIgnoreCase("tamandua")) {
			System.out.println("Nome: " + tb.getNome() + " | Tamanho: " + tb.getTamanhoMax() +
			"\nExpc. Vida: " + tb.getExpcVida() + " | Peso Max: " + tb.getNome() + 
			"\nAmeaçado de Ex: " + tb.isExtincao() + " | Habitat: " + tb.getHabitat() + " | Comida: " +
			tb.getComida());
		} else if (entrada.equalsIgnoreCase("tatu")) {
			System.out.println("Nome: " + tc.getNome() + " | Tamanho: " + tc.getTamanhoMax() +
			"\nExpc. Vida: " + tc.getExpcVida() + " | Peso Max: " + tc.getNome() + 
			"\nAmeaçado de Ex: " + tc.isExtincao() + " | Habitat: " + tc.getHabitat() + " | Comida: " +
			tc.getComida());
		}
		
		////////////////////////////////////////////
		in.close();
	}

}
