package ejerciciosMultiplicacion;

import java.util.ArrayList;

/* (1) Multiplicación a la inglesa – ArrayList */
/**
 * 
 * 
 *         clase donde realizamos el metodo de la multiplicacion inglesa por
 *         medio del arrayList
 */
public class UnoMultiplicacionInglesaArrayList {

	/**
	 * Metodo multiplicacion inglesa
	 * 
	 * @param numero1
	 * @param numero2
	 * @return
	 */
	public ArrayList<Integer> calcularMultiplicacionInglesa(ArrayList<Integer> numero1, ArrayList<Integer> numero2) {

		ArrayList<Integer> acumulador = new ArrayList<>();

		for (int i = 0; i < (numero1.size() + numero2.size()); i++) {
			acumulador.add(i, 0);
		}

		int tam = numero1.size() + numero2.size();

		for (int i = 0; i < numero2.size(); i++) {
			for (int j = 0; j < numero1.size(); j++) {
				acumulador.set(i + j + 1, acumulador.get(i + j + 1) + numero1.get(j) * numero2.get(i));

			}

		}
		for (int i = tam - 1; i > 0; i--) {
			acumulador.set(i - 1, acumulador.get(i - 1) + (acumulador.get(i) / 10));
			acumulador.set(i, acumulador.get(i) % 10);
		}
		return acumulador;
	}
}
