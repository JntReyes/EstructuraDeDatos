/*
UNIVERSIDAD TECNOLOGICA DEL NORTE DE GUANAJUATO
JEANETTE BERENICE REYES RIVERA 1215100847
GSI 1241
OBJETIVO:  obtener el máximo común denominador, así como un método para contar 

*/


package Unidad1;
public class Ejercicio05 {
    static int MCD(int a, int b) {
        if(b==0){
            return a;
        }
        else{
            return MCD(b, a % b);
        }
    }
    public static void main(String[] args) {
        System.out.println(MCD(5,3));
    }    
}