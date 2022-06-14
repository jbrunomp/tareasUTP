/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project_21abril;

/**
 *
 * @author JOHN MENDOZA
 */
public class Ejercicio_13_06_2 {
    public static void main(String[] args) {
        //poblar vector
        int fila=3,col=3;
        int tabla[][]= new int[fila][col];
        String cadena="";
        tabla=poblarMatriz(tabla);
        
        /*MOSTRAR EL ARREGLO*/
        int indFila= tabla.length -1;
        int indCol=tabla[0].length-1;
        
        for(int f=0;f<=indFila;f++){
        for(int c=0;c<=indCol;c++){
           
                
                cadena=cadena+tabla[f][c]+" ";
                
            }
        cadena=cadena+"\n";
        }
        System.out.println(cadena);
        
          /*FIN DE MOSTRAR ARREGLO*/
        
        
       
    }
    
     public static int[][] poblarMatriz(int tabla[][]){
        int indFila= tabla.length -1;
        int indCol=tabla[0].length-1;
        
        for(int f=0;f<=indFila;f++){
        for(int c=0;c<=indCol;c++){
         
              if(f==c || f+c==tabla.length-1){
                  tabla[f][c]=1;
              }else{
                  tabla[f][c]=0;
              }
              
            }
        }
        
        
        return tabla;
    }
    
}
