package ejerciciosMultiplicacion;

/* (8) Multiplicación Egipcia */
/**
 *  
 * @author Rusver Duarte 
 * @author Jessica Quintero
 * @author Javier Bedoya
 * 
 * clase donde realizamos el metodo de la multiplicacion egipcia 
 */

import java.util.Vector;

public class OchoMultiplicacionEgipcia {

	/**
	 * Metodo encargado de la multiplicacion egipcia
	 * 
	 * @param N
	 * @param M
	 * @return
	 */
	public String calcularMultiplicacionEgipcia(int N, int M) {
		char sentido = 0;
		String resultado = "";
		Vector<String> vecMultiplicacion = new Vector<String>();
		int indice = 0;
		resultado += N + "x" + M + "=";
		int potenciaMax = 0;
		if (N == 0 || M == 0) {
			resultado += "0";
		} else {
			while (N >= 1) {
				potenciaMax = obtenerElevadoMayor(N);
				vecMultiplicacion.add(indice, Integer.toString(potenciaMax * M));
				N -= potenciaMax;
				indice++;
			}
			if (sentido == 'u') {
				for (int i = vecMultiplicacion.size() - 1; i >= 0; i--) {
					if (i == 0) {
						resultado += vecMultiplicacion.elementAt(i);
					} else {
						resultado += vecMultiplicacion.elementAt(i) + "+";
					}
				}
			} else if (sentido == 'b') {
				for (int i = 0; i < vecMultiplicacion.size(); i++) {
					if (i == vecMultiplicacion.size() - 1) {
						resultado += vecMultiplicacion.elementAt(i);
					} else {
						resultado += vecMultiplicacion.elementAt(i) + "+";
					}
				}
			}
		}
		return resultado;
	}

	/**
	 * En el siguiente metodo obtenemos el numero elevado maximo
	 * 
	 * @param numero
	 * @return
	 */
	public int obtenerElevadoMayor(int numero) {
		int numeroElevado = 0;
		int it = 0;
		boolean menor = true;
		while (menor == true) {
			numeroElevado = (int) Math.pow(2, it);
			if ((int) Math.pow(2, it + 1) > numero) {
				menor = false;
			}

			it++;
		}
		return numeroElevado;
	}
}
