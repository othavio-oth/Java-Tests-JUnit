package main.principal;

import java.util.Scanner;

public class Menu {
	
	int teclaVoltar = 1;
	
	public void mostraMenu() {
		System.out.println("Escolha um exercicio:");
		System.out.println("1 - Exercicio 1");
		System.out.println("2 - Exercicio 2");
		System.out.println("3 - Exercicio 3");
		System.out.println("7 - Exercicio 7");
		System.out.println("D - Exercicio DOJOPUZZLES");
		System.out.println("----------------------------");
	}

public void escolheOpcao(String option) {
	
	switch (option) {
		case "1": {
			exercicio1.production.Index.main(null);
			break;
		}
		case "2":{
			exercicio2.production.Index.main(null);

			break;
		}
		case "3":{
			exercicio3.production.Index.main(null);

			break;
	
		}
		case "7":{
			exercicio7.production.Index.main(null);

			break;
			
		}
		case "8":{
			exercicio.dojopuzzles.production.Index.main(null);
		}
		
		default: {
			System.out.println("Escolha uma opcao valida\n\n");
			main.principal.Main.main(null);
		}
			
		}
	}
	
	
	

	
	public void voltar(){
		Scanner scan = new Scanner(System.in);
		System.out.println("-----------------------");
		System.out.println("\n\nPara voltar para o menu aperte 1");
		System.out.println("-----------------------");
		System.out.println("Para terminar aperte 0 \n\n");
		teclaVoltar = scan.nextInt();

		if(teclaVoltar ==1) {
			this.mostraMenu();
		}
		
	}

}
