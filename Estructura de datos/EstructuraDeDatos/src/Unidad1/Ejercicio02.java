/*
UNIVERSIDAD TECNOLOGICA DEL NORTE DE GUANAJUATO
JEANETTE BERENICE REYES RIVERA 1215100847
GSI 1241

*/

package Unidad1;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class Ejercicio02 {
    static final String DATA_PATH="datosEje1y2.txt";
    public static void main(String[] args){
        Scanner fileReader = null;
        try{
            fileReader = new Scanner(new File(DATA_PATH));
            System.out.println("Archivo Abierto: " + DATA_PATH);
        }
        catch(FileNotFoundException e){
            System.out.println("El archivo " + DATA_PATH + " No se encuentra");
            System.out.println("Programa Terminado");
            System.exit(0);
        }
        int contador = 1;
        int datoLeido1;
        int datoLeido2;
        System.out.println("Palas Cargadoras 78345");
        while(fileReader.hasNextInt()){
            datoLeido1 = fileReader.nextInt();
            datoLeido2 = fileReader.nextInt();
            System.out.println(contador + ": producto: " + datoLeido1 + " serie: " + datoLeido2);
            contador++;
        }
    }
}
