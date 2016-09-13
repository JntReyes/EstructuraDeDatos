package Unidad2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejercicio01 {
    
    String alumnos[];
    float calif [];
    Scanner fileReader = null;
    int tam;
    
    // Insertar datos desde un archivo al arreglo
    
    public void definirArreglo() {
        
        try{
            fileReader = new Scanner(new File("datosUnidad2Ejercicio1"));
            System.out.println("Archivo Abierto");
        }
        catch(FileNotFoundException e){
            System.out.println("El archivo no se encuentra");
            System.out.println("Programa Terminado");
            System.exit(0);
        }
        int tam = fileReader.nextInt();
        alumnos = new String [tam];
        calif = new float [tam];
    }
    
    // Insertar datos directamente al arreglo
    
    public void DefinirArreglo2(){
        System.out.println("Cuantos Alumnos Hay");
        Scanner lector = new Scanner(System.in);
        int tam = lector.nextInt();
        alumnos = new String [tam];
        calif = new float[tam];
        for (int i = 0; i<alumnos.length; i++){
            System.out.println("Nombre del Alumno: ");
            alumnos[i]=lector.next();
            System.out.println("Calificacion: ");
            calif[i]=lector.nextFloat();
        }
    }
    
    // Recorrer Arreglo para insertar datos en cada uno de los elementos
    
    public void recorrerArreglo(){
        for(int i = 1; i < alumnos.length; i++ ){
            alumnos[i] = fileReader.next();
            calif[i] = fileReader.nextFloat();
        }
    }
    
    public void imprimirDatos(){
        for(int i = 1; i < alumnos.length; i++ ){
            System.out.print(alumnos[i] + " --> ");
            System.out.println(calif[i]);
        }
    }
    
    // Metdodo que muestre alumnos aprobados (>8)
    
    public void imprimirAprobados(){
         for(int i = 1; i < alumnos.length; i++ ){
            if(calif[i] >= 8){
                System.out.println("El alumno " + alumnos[i] + " Aprobo con: " + calif[i]); 
            }
        }
    }
    
    // Metdodo que muestre alumnos aprobados (<8)
    
    public void imprimirReprobados(){
        for(int i = 1; i < alumnos.length; i++ ){
            if(calif[i] < 8){
                System.out.println("El alumno " + alumnos[i] + " Reprobo con: " + calif[i]); 
            }
        }
    }
    
    // Metodod que muestra la mayor Calificaicon
    
    public void defineMayor(){
        float mayor = calif[0];
        int ValMay = 0;
        for (int i=0; i<calif.length; i++){
            if(calif[i]>mayor){
                mayor = calif[i];
                ValMay = i;
            }
        }
        System.out.println("La mayor calificacon es de: " + alumnos[ValMay] + " con: " + calif[ValMay]);
    }   
    
    public static void main(String[] args) {
        Ejercicio01 obj = new Ejercicio01();
        obj.definirArreglo();
        obj.recorrerArreglo();
        obj.imprimirDatos();
        obj.imprimirAprobados();
        obj.imprimirReprobados();
        obj.defineMayor();
    }
}
