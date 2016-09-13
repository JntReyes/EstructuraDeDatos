/*
UNIVERSIDAD TECNOLOGICA DEL NORTE DE GUANAJUATO
JEANETTE BERENICE REYES RIVERA 1215100847
GSI 1241
OBJETIVO: Obtener informacion de los empleados,

*/

package Unidad1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejercicio03 {
    
    String tipoEmple[];
    String Nombre[];
    int Horas [];
    int Pago[];
    Scanner fileReader = null;
    int tamano;
    int TotalPagado = 0;
    float PromedioPago;
    
    public void definirArreglo() {
        
        try{
            fileReader = new Scanner(new File("datosEje03.txt"));
            System.out.println("Archivo Abierto");
        }
        catch(FileNotFoundException e){
            System.out.println("El archivo no se encuentra");
            System.out.println("Programa Terminado");
            System.exit(0);
        }
        int tamano = fileReader.nextInt();
        tipoEmple = new String [tamano];
        Nombre = new String [tamano];
        Horas = new int [tamano];
        Pago = new int [tamano];
    }
    
    public void recorrerArreglo(){
        for(int i = 1; i < tipoEmple.length; i++ ){
            tipoEmple[i] = fileReader.next();
            Nombre[i] = fileReader.next();
            Horas[i] = fileReader.nextInt();
        }
    }
    
    public void imprimirDatos(){
        for(int i = 1; i < tipoEmple.length; i++ ){
            System.out.print(tipoEmple[i] + " --> ");
            System.out.print(Nombre[i] + " --> ");
            System.out.print(Horas[i] + " --> ");
            System.out.println(Pago[i] + "");
        }
    
    }
    
    public void PagoTraba (){
        for(int i = 1; i < tipoEmple.length; i++ ){
            if("A".equalsIgnoreCase(tipoEmple[i])){
                 Pago[i]=Horas[i]*150;
            }
            else{
                if("B".equalsIgnoreCase(tipoEmple[i])){
                 Pago[i]=Horas[i]*250;
                }
                else{
                    if("C".equalsIgnoreCase(tipoEmple[i])){
                    Pago[i]=Horas[i]*500;
                    }
                }
            }
        
        
        }
    }
    
    public void Promedio(){
        for(int i = 1; i < tipoEmple.length; i++ ){
            TotalPagado = TotalPagado + Pago[i];
            PromedioPago = TotalPagado/tipoEmple.length;
        }
        System.out.println("El promedio de pago es de: " + PromedioPago);
    }
    
    public void defineMayor(){
        float mayor = Pago[0];
        int ValorMay = 0;
        for (int i=0; i<Pago.length; i++){
            if(Pago[i]>=mayor){
                mayor = Pago[i];
                ValorMay = i;
            }
        }
        System.out.println("El mayor pago es de: " + Nombre[ValorMay] + " con: " + Pago[ValorMay]);
    }  
    
    public void defineMenor(){
        float menor =Pago[1];
        int ValorMen = 0;
        for (int i=0; i<Pago.length; i++){
            if(Pago[i]<=menor){
                menor = Pago[i];
                ValorMen = i;
            }
        }
        System.out.println("El menor pago es de: " + Nombre[ValorMen] + " con: " + Pago[ValorMen]);
    }
    
    public static void main(String[] args) {
        Ejercicio03 obj = new Ejercicio03();
        obj.definirArreglo();
        obj.recorrerArreglo();
        obj.PagoTraba();
        obj.imprimirDatos();
        System.out.println("");
        obj.defineMayor();
        obj.defineMenor();
        obj.Promedio();
        
    }
}
