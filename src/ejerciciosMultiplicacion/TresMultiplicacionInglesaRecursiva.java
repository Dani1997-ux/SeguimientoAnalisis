package ejerciciosMultiplicacion;

/* (3) Multiplicación a la inglesa Recursiva – Arreglos */
/**
 * 
 * 
 *         clase donde realizamos el metodo de la multiplicacion inglesa
 *         recursiva por medio de los arreglos
 */
public class TresMultiplicacionInglesaRecursiva {

	public static double[] ExtraerUnidades(int Number) {
		int TotalDeUnidades = String.valueOf(Number).length();
		double[] UnidadesExtraidas = new double[TotalDeUnidades];
		int Position = 0;
		double residuo = 0;
		double NumberTem = Number;
		for (int i = TotalDeUnidades - 1; i >= 0; i--) {
			residuo = NumberTem % Math.pow(10, i);
			UnidadesExtraidas[Position] = NumberTem - residuo;
			NumberTem = residuo;
			Position++;

		}
		return UnidadesExtraidas;
	}

	public static int MultiplicarCadaDigito(int i, int N, int[] z) {
		if (i != z.length) {
			return MultiplicarCadaDigito(i + 1, N, z) + (N * z[i]);
		}
		return 0;
	}

	public int MultiplicacionInglesa(int i, int[] UnidadesN, int[] UnidadesM) {
		if (i != UnidadesN.length) {

			return MultiplicacionInglesa(i + 1, UnidadesN, UnidadesM)
					+ MultiplicarCadaDigito(0, UnidadesN[i], UnidadesM);
		}
		return 0;
	}

}