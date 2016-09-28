/*
UNIVERSIDAD TECNOLOGICA DEL NORTE DE GUANAJUATO
JEANETTE BERENICE REYES RIVERA 1215100847
GSI 1241
*/
package EvaluacionUnidad2;

import java.util.Scanner;

public class Ejercicio2DeArreglosBuscaMinas {


    private static int[][] tablero;
//DEFINICION DE ARREGLO BIDIMENSIONAL
    public static int[][] arre() {
        int[][] Sin = {{0, 0, 0, 0, 0},
                       {0, 0, 0, 0, 0},
                       {0, 0, 0, 0, 0},
                       {0, 0, 0, 0, 0}};
        return Sin;
    }

    public static int[][] arreCon() {
        int[][] Con = {{1, 0, 0, 0, 1},
                       {0, 1, 0, 0, 0},
                       {0, 0, 0, 1, 1},
                       {1, 1, 0, 1, 0}};
        return Con;
    }

    public static String mostrar(int[][] tableroSin) { //DATOS QUE DEBE CUMPLIR EL ARREGLO
        String result = "";
        for (int fila = 0; fila < 4; fila++) {
            for (int col = 0; col < 5; col++) {
                result = result + tableroSin[fila][col] + ",";
            }
            result = result + "\n";
        }
        return result;
    }

    public static void main(String[] args) {
        //LEE LOS DAOTS QUE SE VAN A INGRESAR
        Scanner teclado = new Scanner(System.in);
        //MENU
        System.out.println("=================================");
        System.out.println("     JUEGO BUSCA MINAS           ");
        System.out.println("=================================");
        System.out.println("JUGAR.........................[1]");
        System.out.println("SALIR.........................[2]");
        System.out.println("=================================");
        System.out.println("Elige la opcion:");
        System.out.println("=================================");
        int opcion = teclado.nextInt();
        switch (opcion) {
            //SI SELECCIONA LA OPCIÓN 1 EL JUEGO SE EJECUTARA
            case 1:
                Ejercicio2DeArreglosBuscaMinas obj = new Ejercicio2DeArreglosBuscaMinas();
                arre();
                tablero = arreCon();
                System.out.println(mostrar(arre()));

                int fila;
                int col;
                int contador = 0;

                for (int i = 0; i < 5; i++) {
                    System.out.println("Elige ingresando sus coordenadas");
                    System.out.println("FILA: ");
                    fila = teclado.nextInt();
                    System.out.println("COLUMNA: ");
                    col = teclado.nextInt();

                    if (tablero[fila][col] == 0) {
                        contador++;
                        System.out.println("¡SIGUE JUGANDO!");
                    } else {
                        System.out.println("¡HAS PERDIDO!");
                        break;
                    }

                }
                if (contador == 5) {
                    System.out.println("FELICIDADES!!! HAS GANADO");
                }
                break;
                //SALIR DEL JUEGO
            case 2:
                System.exit(0);
        }

    }

}
