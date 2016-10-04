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
public class Ejercicio02OrdenamientoShellSort {

    public static void OrdenarArreglo2ShellSort(double[] arre) {
        int ord = arre.length / 2;
        while (ord >= 1) {
            for (int rec = ord; rec < arre.length; rec++) {
                double temp = arre[rec];
                int j = rec - ord;
                while (j >= 0 && arre[j] > temp) {
                    arre[j + ord] = arre[j];
                    j -= ord;
                }
                arre[j + ord] = temp;
            }
            ord /= 2;
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
        System.out.println("Ejercico 2 Shell Sort");
        OrdenarArreglo2ShellSort(arre);
        imprimir(arre);
    }
}
