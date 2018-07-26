package cr.ac.cenfotec.clases;

public class Main {

	public static void main(String[] args) {
		CribaEratostenes test = new CribaEratostenes();
		//probarFuncionPrincipal(test);
		boolean [] resultado = test.validarNumerosPrimos(11);
		
		for(int i = 0; i < resultado.length; i++) {
			System.out.println(resultado[i]);	
		}
		
	}

	private static void probarFuncionPrincipal(CribaEratostenes test) {
		int[] resultado = test.generaCriba(10);
		
		for(int i = 0; i < resultado.length; i++) {
			System.out.println(resultado[i]);	
		}
	}

}
