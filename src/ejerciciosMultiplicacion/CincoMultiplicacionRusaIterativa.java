package ejerciciosMultiplicacion;

/* (5) Multiplicación a la rusa iterativa – Arreglos */
/**
 * 
 * 
 *         clase donde realizamos el metodo de la multiplicacion rusa por medio
 *         de los arreglos
 */
public class CincoMultiplicacionRusaIterativa {

	/**
	 * Metodo que realiza la multiplicacion rusa de forma iterativa
	 * @param arreglo1
	 * @param arreglo2
	 * @return
	 */
	 public int[] multiplicarRusaIterativa(int arreglo1[], int arreglo2[]){
		 int nuevoArreglo[] = new int [arreglo1.length];
		 
		 for (int i = 0; i < arreglo1.length; i++) {
			
		    int contador= 0;
		    while(arreglo1[i]!=0){
		        if(arreglo1[i] % 2 != 0){
		            contador = contador + arreglo2[i];
		        }
		        arreglo1[i] = arreglo1[i] / 2;
		        arreglo2[i] = arreglo2[i] * 2;
		    }
		     nuevoArreglo[i] = contador;
		}
		 return nuevoArreglo;
}
}

