/*
UNIVERSIDAD TECNOLOGICA DEL NORTE DE GUANAJUATO
JEANETTE BERENICE REYES RIVERA 1215100847
GSI 1241
OBJETIVO: Progrma que realiza los movimiento que se hacen en una Torre de Hanoi dependiendo los
discos que se utilicen

*/

package Unidad1;
public class Ejercicio06 {
    private static int mueve = 0;
    public static int mover(int n, char a, char b, char c) {
        if (n > 0) {
            mover(n - 1, a, c, b);
            System.out.println("mover disco " + a + " a " + c);
            mueve++;
            mover(n - 1, b, a, c);
        }
            return mueve;
    }
    public static void main(String[]args){
	java.util.Scanner leer = new java.util.Scanner(System.in);
	int movimientos;
	System.out.println("Numero de discos: ");
	int n=leer.nextInt();
	movimientos = Ejercicio06.mover(n, 'A', 'B', 'C');
	System.out.println("\nMovimientos efectuados: "+mueve);
    }
}