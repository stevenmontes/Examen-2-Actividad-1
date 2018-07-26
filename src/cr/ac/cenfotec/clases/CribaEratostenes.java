package cr.ac.cenfotec.clases;

public class CribaEratostenes {

	public int[] generaCriba(int tope) {
		int i, j;
		if (tope >= 2) {
			int dim = tope + 1;
			boolean[] primo = validarNumerosPrimos(dim);
			
			int cantPrimos = obtenerCantidadPrimos(dim, primo);
			
			int[] numPrimos = new int[cantPrimos];
			
			for (i = 0, j = 0; i < dim; i++) {
				if (esNumeroPrimo(i, primo))
					numPrimos[j++] = i;
			}

			return numPrimos;
		} else {
			return new int[0];
		}

	}

	private int obtenerCantidadPrimos(int dim, boolean[] primo) {
		int cantPrimos = 0;

		for (int i = 0; i < dim; i++) {
			if (esNumeroPrimo(i, primo))
				cantPrimos++;
		}
		
		return cantPrimos;
	}

	public boolean[] validarNumerosPrimos(int dim) {
		boolean[] primo = inicializarArreglo(dim);
		
		for (int i = 2; i < Math.sqrt(dim) + 1; i++) {
			if (esNumeroPrimo(i, primo)) {
				for (int j = 2 * i; j < dim; j += i) {
					primo[j] = false;
				}
			}
		}
		return primo;
	}

	private boolean[] inicializarArreglo(int dim) {
		boolean[] primo = new boolean[dim];

		for (int i = 0; i < dim; i++) {
			primo[i] = true;
		}
		
		primo[0] = primo[1] = false;
		return primo;
	}
	
	private boolean esNumeroPrimo(int i, boolean[] primo) {
		return primo[i];
	}
}
