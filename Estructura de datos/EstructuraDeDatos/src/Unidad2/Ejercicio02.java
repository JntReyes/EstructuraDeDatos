package Unidad2;

import com.sun.org.apache.xerces.internal.xs.PSVIProvider;

public class Ejercicio02 {
    public static int buscaDato(int arre[], int busca) {
        int pos =-1;
        for(int i =0; i<arre.length; i++){
            if(busca == arre[i]){
                pos=i;
            }
        }
        return pos;
    }
    public static void main(String[] args) {
        int arreglo[]= {10,9,8,5,1,0,-9,5};
        int numeroBuscar = 1;
        int pos = buscaDato(arreglo, numeroBuscar);
        
        if(pos == -1){
            System.out.println("No se encontro el dato");
        }
        else{
            System.out.println("Se encontro el dato en la posicion " + pos);
        }
    }
}
