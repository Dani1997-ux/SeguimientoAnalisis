package ejerciciosMultiplicacion;

/* (4) Multiplicación a la americana Recursiva – Arreglos */
/**
 * 
 * 
 * clase donde realizamos el metodo de la multiplicacion americana recursiva por
 * medio de arreglos
 */
public class CuatroMultiplicacionAmericanaRecursiva {

	public static void americano3(int[] arreglo1, int[] arreglo2, int t, int t2, int[] resultado) {
		for (int i = 0; i < resultado.length; i++) {
			// System.out.print(resultado[i]);
		}
		// System.out.println("//");
		int ps1 = t;// i arr1
		int ps2 = t2;// j arr2
		if (ps1 >= 0) {
			if (ps2 >= 0) {
				resultado[ps1 + ps2 + 1] += arreglo1[ps1] * arreglo2[ps2];
				// System.out.println("AS1: "+arreglo2[ps2]+" AS2:
				// "+arreglo1[ps1]+" POS: "+(ps1+ps2+1)+" RES:
				// "+resultado[ps1+ps2+1]);
				resultado[ps1 + ps2] += resultado[ps1 + ps2 + 1] / 10;
				resultado[ps1 + ps2 + 1] %= 10;
				americano3(arreglo1, arreglo2, ps1, ps2 - 1, resultado);
			} else {
				ps2 = arreglo2.length - 1;
				americano3(arreglo1, arreglo2, ps1 - 1, ps2, resultado);
			}
			// System.out.println("salio");
		}
	}

	public int[] calcularAmericano(int[] a, int[] b, int[] res, int i, int j) {

		if (i < 0) 
			return res;
		
		if (j < 0) 
			return calcularAmericano(a, b, res, i - 1, b.length - 1);
		
		res[i + j + 1] += a[i] * b[j];
		res[i + j] += res[i + j + 1] / 10;
		res[i + j + 1] %= 10;
		return calcularAmericano(a, b, res, i, j - 1);

	}
}
