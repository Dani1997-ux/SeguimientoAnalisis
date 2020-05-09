package ejerciciosMultiplicacion;

import java.util.ArrayList;
import java.util.Random;

/**
 * Clase de ejecucion y pruebas a los metodos de multiplicacion
 * 
 */

public class Aplicacion {

	// Instancias de las clases

	private static TresMultiplicacionInglesaRecursiva MinglesaRecursiva = new TresMultiplicacionInglesaRecursiva();
	private static DosMultiplicacionAmericanaArrayList MamericanaArraylist = new DosMultiplicacionAmericanaArrayList();
	private static CuatroMultiplicacionAmericanaRecursiva MamericanaRecursivo = new CuatroMultiplicacionAmericanaRecursiva();
	private static NueveMultiplicacionBase100 Mbase100 = new NueveMultiplicacionBase100();
	private static DiezMultiplicacionDivideyVenceras1 MdivideVenceras1 = new DiezMultiplicacionDivideyVenceras1();
	private static OnceMultiplicacionDivideYVenceras2 MdivideVenceras2 = new OnceMultiplicacionDivideYVenceras2();
	private static OchoMultiplicacionEgipcia MEgipcia = new OchoMultiplicacionEgipcia();
	private static SieteMultiplicacionHindu MHindu = new SieteMultiplicacionHindu();
	private static UnoMultiplicacionInglesaArrayList MinglesaArraylist = new UnoMultiplicacionInglesaArrayList();
	private static CincoMultiplicacionRusaIterativa MrusaIterativa = new CincoMultiplicacionRusaIterativa();

	public static void main(String[] args) {

		int i = 0;
		int[][] A = new int[32][32];
		int[][] B = new int[32][32];
		// Creacion del arreglo para las pruebas de algunos metodos de
		// multiplicacion
		int[] array = new int[1000];
		int[] array2 = new int[2000];

		int[] resultado = new int[array.length + array2.length];

		// Creaccion de los arraylist para las pruebas de americana e ingles
		// iterativos
		ArrayList<Integer> multiplicador1 = new ArrayList<>();
		ArrayList<Integer> multiplicador2 = new ArrayList<>();
	

		// Creacion de valores para la ejecucion de algunas pruebas
		int operando1 = 100000;
		int operando2 = 80000;

		recorrerArreglo(array, array2, i);
		recorrerMatriz(A, B);
		recorrerArraylist(multiplicador1, multiplicador2);

		/* (1) Multiplicación Inglesa – ArrayList */
		long startTimeInglesaArraylist = System.nanoTime();

		MinglesaArraylist.calcularMultiplicacionInglesa(multiplicador1, multiplicador2);
		long endTimeInglesaArrayList = System.nanoTime() - startTimeInglesaArraylist;
		System.out
				.println("1. Tiempo de Ejecucion Multiplicacion Inglesa Arraylist: " + endTimeInglesaArrayList + " ns");

		/* (2) Multiplicación a la americana – ArrayList */
		long startTimeAmericanaArraylist = System.nanoTime();

		MamericanaArraylist.calcularAmericano(array, array2);
		long endTimeAmericanaArraylist = System.nanoTime() - startTimeAmericanaArraylist;
		System.out.println(
				"2. Tiempo de Ejecucion Multiplicacion Americana ArrayList: " + endTimeAmericanaArraylist + " ns");

		/* (3) Multiplicación inglesa recursiva – Arreglos */
		long startTimeInglesaRecursiva = System.nanoTime();

		MinglesaRecursiva.MultiplicacionInglesa(i, array, array2);
		long endTimeInglesaRecursiva = System.nanoTime() - startTimeInglesaRecursiva;
		System.out
				.println("3. Tiempo de Ejecucion Multiplicacion Inglesa Recursiva: " + endTimeInglesaRecursiva + " ns");

		/* (4) Multiplicación a la americana recursivo – Arreglos */
		long startTimeAmericanaRecursivo = System.nanoTime();

		MamericanaRecursivo.calcularAmericano(array, array2, resultado, 0, 0);
		long endTimeAmericanaRecursivo = System.nanoTime() - startTimeAmericanaRecursivo;
		System.out.println(
				"4. Tiempo de Ejecucion Multiplicacion Americana recursivo: " + endTimeAmericanaRecursivo + " ns");

		/* (5) Multiplicación a la rusa iterativa – Arreglos */
		long startTimeRusaIterativa = System.nanoTime();

		MrusaIterativa.multiplicarRusaIterativa(array, array2);
		long endTimeRusaIterativa = System.nanoTime() - startTimeRusaIterativa;
		System.out.println("5. Tiempo de Ejecucion Multiplicacion Rusa Iterativa: " + endTimeRusaIterativa + " ns");

		/* (6) Multiplicación a la rusa recursiva– Arreglos */
		long startTimeRusaIRecursiva = System.nanoTime();

		SeisMultiplicacionRusaRecursiva.multiplicarRusaRecursivo(operando1, operando2);
		long endTimeRusaRecursiva = System.nanoTime() - startTimeRusaIRecursiva;
		System.out.println("6. Tiempo de Ejecucion Multiplicacion Rusa Recursiva: " + endTimeRusaRecursiva + " ns");

		/* (7) Multiplicación hindu */
		long startTimeHindu = System.nanoTime();

		MHindu.calcularHindu(operando1, operando2);
		long endTimeHindu = System.nanoTime() - startTimeHindu;
		System.out.println("7. Tiempo de Ejecucion Multiplicacion Hindu: " + endTimeHindu + " ns");

		/* (8) Multiplicación Egipcia */
		long startTimeEgipcio = System.nanoTime();

		MEgipcia.calcularMultiplicacionEgipcia(operando1, operando2);
		long endTimeEgipcio = System.nanoTime() - startTimeEgipcio;
		System.out.println("8. Tiempo de Ejecucion Multiplicacion Egipcia: " + endTimeEgipcio + " ns");

		/* (9) Multiplicación de base 100 */
		long startTimeBase100 = System.nanoTime();

		Mbase100.calcularMetodoBase100(operando1, operando2);
		long endTimeBase100 = System.nanoTime() - startTimeBase100;
		System.out.println("9. Tiempo de Ejecucion Multiplicacion  Base 100: " + endTimeBase100 + " ns");

		/* (10) Multiplicación divide y venceras 1 */
		long startTimeDivideYVenceras1 = System.nanoTime();

		MdivideVenceras1.multiplicarArregloDyV(0, array.length - 1, array2);
		long endTimeDivideYVenceras1 = System.nanoTime() - startTimeDivideYVenceras1;
		System.out.println(
				"10.Tiempo de Ejecucion Multiplicacion Divide y venceras 1 " + endTimeDivideYVenceras1 + " ns");

		/* (11) Multiplicación divide y venceras 2 */
		long startTimeDivideYVenceras2 = System.nanoTime();

		MdivideVenceras2.calcularDivideYVenceras2(A, B);
		long endTimeDivideYVenceras2 = System.nanoTime() - startTimeDivideYVenceras2;
		System.out.println(
				"11.Tiempo de Ejecucion Multiplicacion Divide y venceras 2: " + endTimeDivideYVenceras2 + " ns");

	}

	public static void recorrerArraylist(ArrayList<Integer> multiplicador1, ArrayList<Integer> multiplicador2) {
		// creacion y recorrido de los arraylist para el americano y el
		// ingles
		Random random = new Random();

		for (int j = 0; j < multiplicador1.size(); j++) {
			multiplicador1.add(random.nextInt(100000));
		}
		for (int k = 0; k < multiplicador2.size(); k++) {
			multiplicador2.add(random.nextInt(80000));
		}

	}

	public static void recorrerMatriz(int[][] matriz, int[][] matriz2) {
		// Creacion de las matrices para las pruebas del divide y venceras 2
		Random ran = new Random(10000);
		Random r1 = new Random(1000);
		int[][] A = new int[32][32];
		int[][] B = new int[32][32];
		int r, u;
		for (r = 0; r < 1; r++) {
			for (u = 0; u < 1; u++) {
				A[r][u] = ran.nextInt(100000);
				B[r][u] = r1.nextInt(80000);
			}

		}
	}

	public static void recorrerArreglo(int[] array, int[] array2, int i) {

		int elemento = 0;
		int mayor = 0;

		// Recorrido de los arreglos a considerar
		for (i = 0; i < array.length; i++) {

			for (int j = 0; j < array2.length; j++) {

				// Creamos un random para generar numeros aleatorios con
				// cifras por posicion del arreglo
				elemento = (int) ((Math.random() * 99) + 10);
				array[i] = elemento;
				array2[i] = elemento;
				if (mayor < array[i] && mayor < array2[i]) {
					mayor = array[i];
					mayor = array2[i];
				}
			}

		}

	}
}
