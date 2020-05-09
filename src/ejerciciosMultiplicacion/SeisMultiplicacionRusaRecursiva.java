package ejerciciosMultiplicacion;

/* (6) Multiplicación rusa Recursiva – Arreglos */
/**
 * 
 *         clase donde realizamos el metodo de la multiplicacion rusa de forma
 *         iteratiVa
 */
public class SeisMultiplicacionRusaRecursiva {

	/**
	 * Metodo recursivo para la multiplicacion de forma rusa
	 * 
	 * @param A
	 * @param B
	 * @return
	 */
	public static int multiplicarRusaRecursivo(int A, int B) {
		if (A == 1) {
			return (B);
		}
		if (A % 2 != 0) {
			return (B + multiplicarRusaRecursivo(A / 2, B * 2));
		} else {
			return (multiplicarRusaRecursivo(A / 2, B * 2));
		}
	}

	public static int[] operacionFinal(int[] v1, int[] v2, int n) {
		int[] result = null;
		if (n >= 0) {
			result = new int[n];
			multiplicar(v1, v2, result, n, 0);
		}
		return result;
	}

	public static void multiplicar(int[] v1, int[] v2, int[] result, int n, int i) {
		if (i < n) {
			result[i] = multiplicarRusaRecursivo(v1[i], v2[i]);
			multiplicar(v1, v2, result, n, i + 1);
		}
	}
}
