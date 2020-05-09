package ejerciciosMultiplicacion;

/* (7) Multiplicación hindu */
/**
 * 
 * 
 *         clase donde realizamos el metodo de la multiplicacion hindu
 */

public class SieteMultiplicacionHindu {

	public void calcularHindu(int operando1, int operando2) {

		int segNumOp1, primNumOp1, terNumOp2, segNumOp2, primNumOp2;

		// Al calcular el residuo de operando1 obtenemos su ultimo digito.
		segNumOp1 = operando1 % 10;

		// Dividimos entre 10 a operando1 para eliminar el ultimo digito, y
		// volvemos a
		// calcular el resto para quedarnos con el ultimo digito
		operando1 /= 10;
		primNumOp1 = operando1 % 10;

		// Repetimos el proceso con el segundo operador
		terNumOp2 = operando2 % 10;

		operando2 /= 10;
		segNumOp2 = operando2 % 10;

		operando2 /= 10;
		primNumOp2 = operando2 % 10;

		// Declaramos las variables donde guardaremos los resultados de las
		// correspondientes multiplicaciones
		int res1, res2, res3, res4, res5, res6;
		// Multiplicamos cada numero segun las reglas de la multiplicacion Hindu
		res1 = segNumOp1 * primNumOp2;
		res2 = segNumOp1 * segNumOp2;
		res3 = segNumOp1 * terNumOp2;
		res4 = primNumOp1 * primNumOp2;
		res5 = primNumOp1 * segNumOp2;
		res6 = primNumOp1 * terNumOp2;

		// Ahora separamos los digitos de los resultados con el mismo metodo
		// anterior,
		// paso previo declaramos las varibles correspondientes.
		int dig2Res3, dig1Res3, dig2Res2, dig1Res2, dig2Res1, dig1Res1, dig2Res6, dig1Res6, dig2Res5, dig1Res5,
				dig2Res4, dig1Res4;

		dig2Res3 = res3 % 10;
		res3 /= 10;
		dig1Res3 = res3 % 10;

		dig2Res2 = res2 % 10;
		res2 /= 10;
		dig1Res2 = res2 % 10;

		dig2Res1 = res1 % 10;
		res1 /= 10;
		dig1Res1 = res1 % 10;

		dig2Res6 = res6 % 10;
		res6 /= 10;
		dig1Res6 = res6 % 10;

		dig2Res5 = res5 % 10;
		res5 /= 10;
		dig1Res5 = res5 % 10;

		dig2Res4 = res4 % 10;
		res4 /= 10;
		dig1Res4 = res4 % 10;

		int sum5, sum4, sum4_1 = 0, sum4_2 = 0, sum3, sum2, sum2_1 = 0, sum2_2 = 0, sum1;

		sum5 = dig2Res3;
		sum4 = dig2Res2 + dig1Res3 + dig2Res6;
		sum4_1 = sum4 / 10;
		sum4_2 = sum4 % 10;
		sum3 = dig2Res1 + dig1Res2 + dig2Res5 + dig1Res6 + sum4_1;
		sum2 = dig1Res1 + dig2Res4 + dig1Res5;
		sum2_1 = sum4 / 10;
		sum2_2 = sum2 % 10;
		sum1 = dig1Res4 + sum2_1;

		// Por ultimo imprimimos en pantalla el resultado:
		// System.out.print(" " + sum1 + sum2_2 + sum3 + sum4_2 + sum5);
	}

}
