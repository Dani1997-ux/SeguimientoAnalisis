package ejerciciosMultiplicacion;

/* (11) Multiplicación divide y venceras 2 Matrices*/

public class OnceMultiplicacionDivideYVenceras2 {

	/**
	 * Metodo para sumar dos matrices
	 * 
	 * @param matriz1
	 * @param matriz2
	 * @return
	 */
	public static int[][] sumarMatrices(int[][] matriz1, int[][] matriz2) {
		int[][] nuevaMatriz = new int[matriz1.length][matriz2.length];
		for (int i = 0; i < matriz1.length; i++) {
			for (int j = 0; j < matriz2.length; j++) {
				nuevaMatriz[i][j] = matriz1[i][j] + matriz2[i][j];
			}
		}

		return nuevaMatriz;
	}

	/**
	 * Metodo para restar posiciones de dos matrices
	 * 
	 * @param matriz1
	 * @param matriz2
	 * @return
	 */
	public static int[][] restarMatrices(int[][] matriz1, int[][] matriz2) {
		int[][] nuevaMatriz = new int[matriz1.length][matriz2.length];
		for (int i = 0; i < matriz1.length; i++) {
			for (int j = 0; j < matriz2.length; j++) {
				nuevaMatriz[i][j] = matriz1[i][j] - matriz2[i][j];
			}
		}

		return nuevaMatriz;
	}

	/**
	 * Metodo para multiplicar y acumular dos matrices en una nueva matriz
	 * 
	 * @param matriz1
	 * @param matriz2
	 * @return
	 */
	public static int[][] multiplicarBasica(int[][] matriz1, int[][] matriz2) {
		int[][] nuevaMatriz = new int[matriz1.length][matriz1.length];
		for (int i = 0; i < nuevaMatriz.length; i++) {
			for (int j = 0; j < nuevaMatriz.length; j++) {
				for (int k = 0; k < nuevaMatriz.length; k++) {
					nuevaMatriz[i][j] += matriz1[i][k] * matriz2[k][j];
				}
			}
		}

		return nuevaMatriz;
	}

	/**
	 * Metodo para imprimir una matriz
	 * 
	 * @param matriz
	 */
	public static void imprimirMatriz(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
	}

	/**
	 * Metodo para calcular el divide y venceras 2
	 * 
	 * @param matriz1
	 * @param matriz2
	 */
	public void calcularDivideYVenceras2(int[][] matriz1, int[][] matriz2) {
		int dividir = matriz1.length / 2;
		int[][] A11 = new int[dividir][dividir];
		int[][] A12 = new int[dividir][dividir];
		int[][] A21 = new int[dividir][dividir];
		int[][] A22 = new int[dividir][dividir];
		int[][] B11 = new int[dividir][dividir];
		int[][] B12 = new int[dividir][dividir];
		int[][] B21 = new int[dividir][dividir];
		int[][] B22 = new int[dividir][dividir];
		for (int i = 0; i < dividir; i++) {
			for (int j = 0; j < dividir; j++) {
				A11[i][j] = matriz1[i][j];
				B11[i][j] = matriz2[i][j];
				A12[i][j] = matriz1[i][dividir + j];
				B12[i][j] = matriz2[i][dividir + j];
				A21[i][j] = matriz1[dividir + i][j];
				B21[i][j] = matriz2[dividir + i][j];
				A22[i][j] = matriz1[dividir + i][dividir + j];
				B22[i][j] = matriz2[dividir + i][dividir + j];
			}
		}
		int[][] M1 = multiplicarBasica((sumarMatrices(A11, A22)), (sumarMatrices(B11, B22)));
		int[][] M2 = multiplicarBasica((sumarMatrices(A21, A22)), (B11));
		int[][] M3 = multiplicarBasica((A11), (restarMatrices(B12, B22)));
		int[][] M4 = multiplicarBasica((A22), (restarMatrices(B21, B11)));
		int[][] M5 = multiplicarBasica((sumarMatrices(A11, A12)), (B22));
		int[][] M6 = multiplicarBasica((restarMatrices(A21, A11)), (sumarMatrices(B11, B12)));
		int[][] M7 = multiplicarBasica((restarMatrices(A12, A22)), (sumarMatrices(B21, B22)));
		int[][] C11 = sumarMatrices((sumarMatrices(M1, restarMatrices(M4, M5))), M7);
		int[][] C12 = sumarMatrices(M3, M5);
		int[][] C21 = sumarMatrices(M2, M4);
		int[][] C22 = sumarMatrices((sumarMatrices(restarMatrices(M1, M2), M3)), M6);
		int[][] C = new int[matriz1.length][matriz1.length];
		for (int i = 0; i < dividir; i++) {
			for (int j = 0; j < dividir; j++) {
				C[i][j] = C11[i][j];
				C[i][dividir + j] = C12[i][j];
				C[dividir + i][j] = C21[i][j];
				C[dividir + i][dividir + j] = C22[i][j];
			}
		}
		// System.out.println("****************************************************");
		// System.out.println("Algoritmo de divide y venceras 2, orden n^2.8:");
		// imprime(C);
		// System.out.println("****************************************************");
	}
}
// METODO ANTERORIOR SUMINISTRADO POR EL PROFESOR

/*
 * //Algoritmo que suma dos vectores de igual tamaño y retorna un vector con el
 * //tamaño recibido como parametro mas uno (necesitada principalmente en DV#2)
 * public int[] suma2(int vec1[],int vec2[],int n){ int resu[]; int k,p,r,i,j;
 * 
 * resu=new int [n+1];
 * 
 * iniceros(resu,n+1); j=n; for(i=n-1;i>=0;i--){ k=vec1[i]+vec2[i]; if(k>9){
 * p=k%10; r=k/10; resu[j]=resu[j]+p; resu[j-1]=r; } else{ resu[j]=resu[j]+k; }
 * j--; }
 * 
 * 
 * return resu; }
 * 
 * public int[] dv2(int Num[],int Num2[],int tam){
 * 
 * int x[],y[],z[],w[],p[],q[],r[],wy[],xz[],s[],l[],n,aux[],aux2[],i,a[],b[];
 * 
 * 
 * if(tam>=64){ //Esta validacion nos permite ejecutar el algoritmo DV2 mientras
 * //el tamaño de los dos vectores sea mayor que 64 que es donde el //algoritmo
 * es mas eficiente que el clasico, en caso contrario //se ejecuta el clasico .
 * 
 * 
 * r=new int[tam+2]; p=new int[(tam/2)+1]; //p guarda la suma entre "w" y "x"
 * q=new int[(tam/2)+1]; //q guarda la suma entre "y" y "z"
 * 
 * wy=new int[tam]; //wy guarda la multiplicacion de "w" y "y" xz=new int[tam];
 * //xz guarda la multiplicacion de "x" y "z"
 * 
 * //Separamos memoria dinamica de la mitad del tamaño de los vectores iniciales
 * //para cada uno de los vectores componentes del algoritmo x=new int[tam/2];
 * y=new int[tam/2]; z=new int[tam/2]; w=new int[tam/2];
 * 
 * s=new int[2*tam];
 * 
 * for(i=0;i<tam/2;i++){ //llenamos lo componentes w[i]=Num[i]; y[i]=Num2[i];
 * x[i]=Num[i+(tam/2)]; z[i]=Num2[i+(tam/2)]; }
 * 
 * p=suma2(w,x,tam/2); //Garantizamos que el vector sea de tamaño par //mediante
 * vectores auxiliares if(p.length%2!=0){ aux=new int[p.length+1];
 * for(i=0;i<p.length;i++)aux[i+1]=p[i]; } else{ aux=new int[p.length];
 * for(i=0;i<p.length;i++)aux[i]=p[i]; }
 * 
 * q=suma2(y,z,tam/2);
 * 
 * //Garantizamos que el vector sea de tamaño par //mediante vectores auxiliares
 * if(q.length%2!=0){ aux2=new int[q.length+1];
 * for(i=0;i<q.length;i++)aux2[i+1]=q[i]; } else{ aux2=new int[q.length];
 * for(i=0;i<q.length;i++)aux2[i]=q[i]; }
 * 
 * r=dv2(aux,aux2,p.length+1); //r es la multiplicacion entre "p" y "q"
 * wy=dv2(w,y,tam/2); //transformado en los auxiliares que garantizan su
 * xz=dv2(x,z,tam/2); //tamaño par
 * 
 * r=resta(r,r.length,wy,wy.length); //restamos "r" con "wy"
 * r=resta(r,r.length,xz,xz.length); //el resultado anterior lo restamos con
 * "xz"
 * 
 * a=new int[wy.length+tam]; //en a se guarda "wy" y se adicionan los ceros de
 * iniceros(a,wy.length+tam); //la formula
 * 
 * for(i=0;i<wy.length;i++){ a[i]=wy[i]; }
 * 
 * b=new int[r.length+(tam/2)];//en b se guarda "r" y se adicionan los ceros de
 * //la formula for(i=0;i<r.length;i++){ b[i]=r[i]; }
 * 
 * s=suma(a,wy.length+tam,b,r.length+(tam/2)); //en s se guarda la suma de "a" y
 * "b" s=suma(s,s.length,xz,xz.length); //en s se guarda la suma de el resultado
 * //anterior y "xz" } else { return Alg(Num,Num.length,Num2,Num2.length); //el
 * caso trivial }
 * 
 * return s; } // Este metodo incializa los arreglos con ceros void iniceros(int
 * arre[], int tam) {
 * 
 * for (int i = 0; i < tam; i++) { arre[i] = 0; }
 * 
 * }
 * 
 * //
 * -----------------------------------------------------------------------------
 * ----------- // Algoritmo que suma dos vectores de diferente tamaño y retorna
 * un vector // con el // tamaño del vector recibido como parametro mas grande
 * (necesitada // principalmente en DV#1) public int[] suma(int vec1[], int n,
 * int vec2[], int m) { int resu[]; int k, p, r, s, i, j, l, aux, aux2, tam;
 * 
 * if (n > m || n == m) { aux = m; aux2 = n; } else { aux = n; aux2 = m; }
 * 
 * resu = new int[aux2]; iniceros(resu, aux2); k = aux2 - 1; for (i = aux - 1, l
 * = aux2 - 1; i >= 0; i--, l--) { p = vec1[l] + vec2[i]; if (p > 9) { r = p %
 * 10; s = p / 10; resu[k] += r;
 * 
 * resu[k - 1] += s; } else { resu[k] += p; if (resu[k] > 9) { r = resu[k] % 10;
 * s = resu[k] / 10; resu[k] = r; resu[k - 1] += s; }
 * 
 * } k--; } if (n != m) for (i = l; i >= 0 && l >= 0; i--, l--) { if (n > m)
 * resu[i] += vec1[l]; else resu[i] += vec2[l]; }
 * 
 * return resu; }
 * 
 * 
 * // Este es el algoritmo clasico de la multiplicacion public int[] Alg(int
 * Num[], int tam1, int Num2[], int tam2) {
 * 
 * int l = tam1 + tam2 - 1, pos = tam1 + tam2 - 1; ; int res[] = new int[tam1 +
 * tam2];
 * 
 * for (int y = 0; y <= tam1 + tam2 - 1; y++) { res[y] = 0; }
 * 
 * // ---------------------Algoritmo clasico de la //
 * multiplicacion---Inicio-------------------- for (int i = tam1 - 1; i >= 0;
 * i--) {
 * 
 * for (int j = tam2 - 1; j >= 0; j--) {
 * 
 * res[l] += Num[i] * Num2[j]; // Multiplica cada posicion de los // dos
 * vectores if (res[l] > 9) { // teniendo en cuenta el orden. res[l - 1] +=
 * res[l] / 10; res[l] = res[l] % 10; } l--; } l = pos; pos--; l--; } //
 * ---------------------Algoritmo clasico de la //
 * multiplicacion--fin-------------------- return res;
 * 
 * }
 * 
 * int[] resta(int Num[],int tam,int Num2[],int tam2){ int r,j,carry=0,i; int
 * resu[];
 * 
 * 
 * resu=new int[tam];
 * 
 * for(i=0;i<tam;i++){ resu[i]=0; }
 * 
 * for(i=tam-1,j=tam2-1;j>=0;i--,j--){ if(Num[i]>=Num2[j]){
 * if((Num[i]+carry)>=Num2[j]){ resu[i]=resu[i]+(Num[i]+carry)-Num2[j]; carry=0;
 * } else{ r=Num[i]+carry+10; resu[i]=resu[i]+(r-Num2[j]); carry=-1;
 * 
 * } } else { r=Num[i]+10; resu[i]=resu[i]+(r-Num2[j]+carry); carry=-1; } }
 * resu[i]+=carry;
 * 
 * for(j=i;j>=0;j--){ resu[j]+=Num[j]; }
 * 
 * 
 * return resu; }
 */
