package exercicio2.production;

public class Taxa implements Imposto{

	@Override
	public double defineImposto(boolean isUsed) {
		if(isUsed) {
			return 0.25;
		}else {
			return 0.45;
		} 
		
	}

	@Override
	public double defineImposto(String tipo) {
		if(tipo == "educativo") {
			return 0;
		} else {
			return 0.1;
		}
		
	}
	
	

	

	

	
}
