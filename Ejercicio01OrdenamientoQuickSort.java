/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EvaluacionUnidad2;

/**
 *
 * @author Jeanette Berenice Reyes Rivera
 */
public class Ejercicio01OrdenamientoQuickSort {

    public static void ordenarArreglo(int vect[], int izq, int der) {
        int i = 0, j = 0;
        int x = 0, aux = 0;

        i = izq;
        j = der;
        x = vect[(izq + der) / 2]; //pivote

        do {
            while ((vect[i] < x) && (j < der)) {
                i++;
            }
            while ((x < vect[j]) && (j > izq)) {
                j--;
            }
            if (i <= j) {
                aux = vect[i];
                vect[i] = vect[j];
                vect[j] = aux;
                i++;
                j--;
            }
        } while (i <= j);
        if (izq < j) {
            ordenarArreglo(vect, izq, j);
        }
        if (i < der) {
            ordenarArreglo(vect, i, der);
        }
    }

    public static void main(String[] args) {

        int arreglo1[] = {25, 14, 5, 1, 0, 33, 15, 16, 21, 6, 0};
        System.out.println("Quick sort");
        ordenarArreglo(arreglo1, 0, arreglo1.length - 1);
        for (int i = 0; i < arreglo1.length; i++) {
            System.out.print(arreglo1[i] + " ");
        }
    }

}
