package exercicio.dojopuzzles.production;

import java.util.Scanner;

public class Ano {
	
	public boolean EhBissexto(int ano) {
		if(ano%4==0&&ano%4!=100) {
			return true;
		} else if(ano%100==0&&ano%400==0) {
			return true;
		}else
			return false;
	}
			
	Scanner scan = new Scanner(System.in);
	
	int anoDigitado;

	
	public int getAnoDigitado() {
		return anoDigitado;
	}

	public void setAnoDigitado(int anoDigitado) {
		this.anoDigitado = anoDigitado;
	}

	public int iniciar() {
		System.out.println("Digite um ano:");
		anoDigitado= scan.nextInt();
		return anoDigitado;
		
	}
	
	public void mostrarSeEhBissexto() {
		if(this.EhBissexto(iniciar())) {
			System.out.println(anoDigitado+" e um ano bissexto");
		}else {
			System.out.println(anoDigitado + " Nao e um ano bissexto");
		}
		
	}
	
	
	
}
