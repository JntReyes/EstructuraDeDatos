/*
UNIVERSIDAD TECNOLOGICA DEL NORTE DE GUANAJUATO
JEANETTE BERENICE REYES RIVERA 1215100847
GSI 1241
*/

package EvaluacionUnidad2;


public class Ejercicio1DeArreglos {
    
    public static String muestraDatos(int mat [][]){
        
        String result="";
        
        for(int fila = 0; fila<mat.length;fila++){
            for(int columna=0; columna<mat[fila].length;columna++){
                result = result + mat[fila][columna]  + ", ";
            }
            result = result + "\n";
        }
        return result;
    }
    public void sumaDatosFila(int mat [][]){
        for(int fila = 0; fila<mat.length;fila++){
            int result = 0;
            for(int columna=0; columna<mat[fila].length;columna++){
                result = result + mat[fila][columna];
            }
            System.out.println("Producción por producto " + (fila+1)+" -> " +result);
        }
        System.out.println("");
    }
    public void sumaDatosColumna(int mat [][]){
        int result=0; 
        for(int fila=0; fila <6 ; fila++){ 
            for(int columna=0; columna<3; columna++){  
                result=result+mat[columna][fila]; 
            } 
            System.out.println("Produccion por mes "  + (fila+1)+" -> "+ result);
            result=0;
        } 
    System.out.println("");
}
    public static void main(String[] args) {
        Ejercicio1DeArreglos arre = new Ejercicio1DeArreglos();
        int [][] matriz = {{25,20,20,50,50,30},{20,15,15,90,80,90},{15,10,10,40,30,40}};
        System.out.println(muestraDatos(matriz));
        arre.sumaDatosColumna(matriz);
        arre.sumaDatosFila(matriz);
        
        
        
    }
}


