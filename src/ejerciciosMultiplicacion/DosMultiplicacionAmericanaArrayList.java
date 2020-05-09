package ejerciciosMultiplicacion;

import java.util.ArrayList;

/* (2) Multiplicación a la americana – ArrayList */
/**
 * 
 * 
 *         clase donde realizamos el metodo de la multiplicacion americana por
 *         medio del arrayList
 */
public class DosMultiplicacionAmericanaArrayList {

	public ArrayList<Integer> calcularAmericano(int[] arreglo, int[] arreglo2) {
		ArrayList<Integer> resultado = new ArrayList<>();
		int pos = arreglo.length + arreglo2.length;
		for (int k = 0; k < pos; k++) {
			resultado.add(k, 0);
		}
		for (int i = arreglo2.length - 1; i >= 0; i--) {
			for (int j = arreglo.length - 1; j >= 0; j--) {
				resultado.set(i + j + 1, resultado.get(i + j + 1) + (arreglo2[i] * arreglo[j]));
				resultado.set(i + j, resultado.get(i + j) + (resultado.get(i + j + 1) / 10));
				resultado.set(i + j + 1, resultado.get(i + j + 1) % 10);
			}
		}
		return resultado;
	}
}
