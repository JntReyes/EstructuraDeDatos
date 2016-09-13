package series;

public class Ejercicio04 {
	
	
	/*
	 *UTNG - Sistemas Informaticos
	 *Autor: Omar Uriel Rodriguez Castañeda
	 *Objetivo del programa: Metodos de recursividad
	 *No.C. 1215100945
	 */
	
	
	static int factorial (int numero){
		if (numero <= 1){
		return 1;
	} else {
		return numero * factorial (numero - 1);
	} 
	}
	
	//método para contar de 1..N
	// este metodo cuneta de 1 a n cantidad y este va sumandose 
	// hasta llegar al numero especificado
	static int inicial=1;
	static void cuentaHasta(int n){
		if (inicial<=n) {
			System.out.println(inicial);
			inicial++;
			cuentaHasta(n);
		}
	}
	
	//metodo para una cuenta regresiva a partir de N a 0
	// Este metodo va disminuyendo de un numero dado hasta llegar a 0
	static void regresa(int n){
		if (n>=0) {
			System.out.println(n);
			n--;
			regresa(n);
		}
	}
	
	//
	static int MaximoComun(int a, int b){
		if (b == 0){
			String cadena ="" + a;
			System.out.println("El maximo comun es " + a);
			return a;
		    
		} else {
			return MaximoComun(b, a % b);
		}
		
	}
	
	
		public static void main (String args[]){
			//System.out.println(factorial(4));
			//cuentaHasta(5);
			//regresa(8);
			//System.out.println(MaximoComun(8,12));
			MaximoComun(8,12);
		}
}

