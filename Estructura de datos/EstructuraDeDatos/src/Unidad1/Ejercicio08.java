/*
UNIVERSIDAD TECNOLOGICA DEL NORTE DE GUANAJUATO
JEANETTE BERENICE REYES RIVERA 1215100847
GSI 1241
OBJETIVO: : Calcular el elemento mayor de un array entero de n-elementos, se puede calcular recursivamente.
*/

package Unidad1;

public class Ejercicio08 {

    public static void main(String[] args) {
        int[] array = {15, 5, 45, 62, 111, -30, 26};
        System.out.println("El numero mayor es : " + Mayor(array, 0, array[0]));
    }

    static int Mayor(int[] array, int n, int mayor) {
        if (n == array.length) {
            return mayor;
        }

        if (array[n] > mayor) {
            mayor = array[n];
        }

        return Mayor(array, ++n, mayor);
    }
}

