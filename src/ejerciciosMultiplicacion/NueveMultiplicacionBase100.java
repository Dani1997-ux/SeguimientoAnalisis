package ejerciciosMultiplicacion;

/* (9) Multiplicación base 100  */

/**
 * 
 * 
 */

public class NueveMultiplicacionBase100 {

	public void calcularMetodoBase100(int operando1, int operando2) {

		// Declaracion de variables donde guardaremos los resultados del primer
		// paso de esta multiplicacion: restar 100 - operando.
		int res1, res2;
		res1 = 100 - operando1;
		res2 = 100 - operando2;

		// Siguente paso, sumamos ambos resultados. Y este resultado se lo
		// restamos a 100.
		int suma;
		suma = 100 - (res1 + res2);

		// Siguente paso, multiplicamos ambos resultados res1 y res2.
		int multiplicacion;
		multiplicacion = res1 * res2;

		// Por ultimo, concatenamos los resultados, y los mostramos en pantalla.
		// System.out.println(" " + suma + multiplicacion);
	}
}