package main.principal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Menu menu = new Menu();
		
		menu.mostraMenu();
		
		while(menu.teclaVoltar != 0) {
			
			String option = scan.nextLine();
			menu.escolheOpcao(option);
			menu.voltar();
		
		}
		
			System.out.println("Fim do Programa");
		
		
	}	
		
}
