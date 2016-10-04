/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EvaluacionUnidad2;

import static java.util.Arrays.sort;
import static java.util.Arrays.sort;
import static java.util.Arrays.sort;
import static java.util.Arrays.sort;
import static java.util.Arrays.sort;
import static java.util.Arrays.sort;
import static java.util.Arrays.sort;
import static java.util.Arrays.sort;
import static java.util.Arrays.sort;
import static java.util.Arrays.sort;
import static java.util.Arrays.sort;
import static java.util.Arrays.sort;
import static java.util.Arrays.sort;
import static java.util.Arrays.sort;
import static java.util.Arrays.sort;
import static java.util.Arrays.sort;
import static java.util.Arrays.sort;
import static java.util.Arrays.sort;
import static java.util.Arrays.sort;
import static java.util.Arrays.sort;
import static java.util.Arrays.sort;
import static java.util.Arrays.sort;
import static java.util.Arrays.sort;
import static java.util.Arrays.sort;
import static java.util.Arrays.sort;
import static java.util.Arrays.sort;
import static java.util.Arrays.sort;
import static java.util.Arrays.sort;
import static java.util.Arrays.sort;
import static java.util.Arrays.sort;
import static java.util.Arrays.sort;
import static java.util.Arrays.sort;

/**
 *
 * @author Jeanette Berenice Reyes Rivera
 */
public class Ejercicio02OrdenamientoQuickSort {

    public static void OrdenarArreglo2QuickSort(double[] arre) {
        double[] izq = null,
                 der = null; 
        
        int left, right;
        double pivot;
        int i, j, k;
        
        if (arre.length <= 1) {
            return;
        }
        pivot = arre[arre.length - 1];
        left = right = 0;
        for (i = 0; i < arre.length - 1; i++) {
            if (arre[i] <= pivot) {
                left++;
            } else {
                right++;
            }
        }
        izq = new double[left];
        der = new double[right];
        i = 0;
        j = 0;
        for (k = 0; k < arre.length - 1; k++) {
            if (arre[k] <= pivot) {
                izq[i++] = arre[k];
            } else {
                der[j++] = arre[k];
            }
        }
        sort(izq);
        sort(der);
        k = 0;
        for (i = 0; i < izq.length; i++) {
            arre[k++] = izq[i];
        }
        arre[k++] = pivot;
        for (j = 0; j < der.length; j++) {
            arre[k++] = der[j];
        }
    }

    public static void imprimir(double[] a) {
        String sal = "";
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 10) {
                sal += " " + a[i] + " ";
            } else {
                sal += a[i] + " ";
            }
        }
        System.out.println(sal);
    }

    public static void main(String[] args) {

        double arre[] = {10.23, 23.10, 55.10, 55.001, 24.15, 24.5, 24.01, 18.0, 13.3, 10.23};
        System.out.println("Ejercicio 2 QuickSort");
        OrdenarArreglo2QuickSort(arre);
        imprimir(arre);

    }
}
