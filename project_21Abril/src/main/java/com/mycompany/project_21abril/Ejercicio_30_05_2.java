/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project_21abril;

import static com.mycompany.project_21abril.Ejercicio_30_05_1.llenaArreglo;

/**
 *
 * @author JOHN MENDOZA
 * Escriba un programa simule varios lanzamientos de un dado y muestre la frecuencia de
cada una de las caras, así como la proporción del número de veces que haya salido cada cara
con respecto al total. Para ello simule 500 lanzamientos de un dado utilizando la función
Math.random() *(6-1+1)+1 para simular cada lanzamiento y almacénelo en un arreglo.
 */
public class Ejercicio_30_05_2 {
    
    public static void main(String[] args) {
        
         int n=500;
        String numeros[]= new String[n];
        numeros=llenaArreglo(numeros);
      
        String s_array="";
        for(int i=0;i<numeros.length;i++){
            s_array=s_array+numeros[i]+", ";
        }
        System.out.println("Array: "+s_array);
        System.out.println("Frecuencia Cara: "+((double)contarvalor("C", numeros)/n)*100);
        System.out.println("Frecuencia Sello: "+((double)contarvalor("S", numeros)/n)*100);
        
        
    }

     public static String[] llenaArreglo(String a[]){
      
        int indMax=a.length-1;
        String valor;
        int rdm;
        /* 7 Vueltas*/
        for(int i=0; i<= indMax;i++){
            rdm=(int)(Math.random()*2);
        
            if(rdm==0){
            valor="C";
            }else{
            valor="S"; 
            }
        a[i]=valor;
        
      }
            
        return a;
    }
     
       public static int contarvalor(String val,String c[]){
      int cont=0;
      int indMax=c.length-1;
      
      for(int i=0;i<=indMax;i++){
          
          if(c[i].equals(val)){
              cont++;
          }
      }
      return cont;
      }
}
