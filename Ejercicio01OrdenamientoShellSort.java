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
public class Ejercicio01OrdenamientoShellSort {
    
 public static void OrdenaArregloShellsort (int[] arre) {
        int ord=arre.length/2;
        while(ord>=1){
        for(int rec=ord;rec<arre.length;rec++){
            int temp=arre[rec];
            int j=rec-ord;
            while(j>=0&&arre[j]>temp){
                arre[j+ord]=arre[j];
                j-=ord;
            }
            arre[j+ord]=temp;
        }
        ord/=2;
        }
    }
 public static void imprimir(int []a){
        String sal="";
        for(int i=0;i<a.length;i++){
            if(a[i]<10)
                sal+=" "+a[i]+" ";
            else
                sal+=a[i]+" "; 
        }
        System.out.println(sal); 
    }
 public static void main (String[] args) {
        
        int a[]={25, 14, 5, 1, 0, 33, 15, 16, 21, 6, 0};
        System.out.println("Shell sort");
        OrdenaArregloShellsort(a);
        imprimir(a);
        
    } 
}

