/*
UNIVERSIDAD TECNOLOGICA DEL NORTE DE GUANAJUATO
JEANETTE BERENICE REYES RIVERA 1215100847
GSI 1241
OBJETIVO: método recursivo para transformar un número entero (menor a diez mil) 
en una cadena los dígitos de que consta: String entroCadena(int n).

*/

package Unidad1;

public class Ejercicio07 {

    int Separar(int n) {
        int num = n;
        if (n == 0) {     
            return n;
        } else {
            num = n % 10;
            if (num == 0) {
                System.out.println(" cero ");
            }
            if (num == 1) {
                System.out.println(" uno ");
            }
            if (num == 2) {
                System.out.println(" dos ");
            }
            if (num == 3) {
                System.out.println(" tres ");
            }
            if (num == 4) {
                System.out.println(" cuatro ");
            }
            if (num == 5) {
                System.out.println(" cinco ");
            }
            if (num == 6) {
                System.out.println(" seis ");
            }
            if (num == 7) {
                System.out.println(" siete ");
            }
            if (num == 8) {
                System.out.println(" ocho ");
            }
            if (num == 9) {
                System.out.println(" nueve ");
            }
            return Separar(n / 10);
        }
    }

    public static void main(String[] args) {
        Ejercicio07 obj = new Ejercicio07();
        obj.Separar(1989);

    }

}
