/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project_21abril;

/**
 *
 * @author JOHN MENDOZA
 Una empresa de colectivos tiene 3 líneas de 12 autos cada uno. Por cada viaje el chofer
entrega al llegar a la terminal una planilla con el número de autos (de 1 a 12), número de línea
(de 1 a 3), número de línea (de 1 a 3) y la recaudación del viaje (entre 20 y 90soles). Se pide
informar por pantalla:

La recaudación total por línea de colectivo (por filas).
La recaudación total por auto (por columna).
La recaudación total general.
 
 
 */
public class Ejercicio_13_06_1 {
    
    public static void main(String[] args) {
        
        //poblar la matriz 3*12
        int lineas=3, autoxlinea=12;
        int contxFila=0,contxCol=0,contxTotal=0;
        int autos[][]= new int[lineas][autoxlinea];
        String cadena="";
        autos=poblarMatriz(autos);
      
       /*MOSTRAR EL ARREGLO*/
        int indFila= autos.length -1;
        int indCol=autos[0].length-1;
        
        for(int f=0;f<=indFila;f++){
        for(int c=0;c<=indCol;c++){
           
                
                cadena=cadena+autos[f][c]+" ";
                
            }
        cadena=cadena+"\n";
        }
        System.out.println(cadena);
        
          /*FIN DE MOSTRAR ARREGLO*/
          
           /*CALCULA SUMA x LINEA*/
           //3 veces
          for(int f=0;f<=indFila;f++){
               //12 veces
              for(int c=0;c<=indCol;c++){
           
                
                contxFila=contxFila+autos[f][c];
                
            }
              
        System.out.println("La Linea "+ (f+1)+" suma :"+ contxFila);
        contxTotal=contxTotal+contxFila;
        contxFila=0;
        
        } 
          
            /*CALCULA SUMA x COLUMNA*/
          //12 veces
          for(int c=0;c<=indCol;c++){
              //3 vece
          for(int f=0;f<=indFila;f++){
               
             
           
                
                contxCol=contxCol+autos[f][c];
                
            }
              
        System.out.println("La Columna "+ (c+1)+" suma :"+ contxCol);
        contxCol=0;
        } 
          
          System.out.println("La suma total es :"+ contxTotal);
        
    }
    
    public static int[][] poblarMatriz(int autos[][]){
        int indFila= autos.length -1;
        int indCol=autos[0].length-1;
        
        for(int f=0;f<=indFila;f++){
        for(int c=0;c<=indCol;c++){
         
                
                autos[f][c]=(int)(Math.random()*(90-20+1)+20);
            }
        }
        
        
        return autos;
    }
}
