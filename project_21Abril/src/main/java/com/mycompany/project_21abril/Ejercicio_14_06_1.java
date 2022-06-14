/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project_21abril;
import java.util.Arrays;
/**
 *
 * @author JOHN MENDOZA
 * Escriba un programa simule varios lanzamientos de un dado y muestre la frecuencia de
cada una de las caras, así como la proporción del número de veces que haya salido cada cara
con respecto al total. Para ello simule 500 lanzamientos de un dado utilizando la función
Math.random() *6 para simular cada lanzamiento y almacénelo en un arreglo.
 */
public class Ejercicio_14_06_1 {
    
    public static void main(String[] args) {
        
        //Poblar nuestro arreglo
        int lanzamientos=500;
        int dado[]=new int [lanzamientos];
        int f1,f2,f3,f4,f5,f6;
        dado=poblarResultados(dado);
       
        f1=contarDado(1,dado);
        f2=contarDado(2,dado);
        f3=contarDado(3,dado);
        f4=contarDado(4,dado);
        f5=contarDado(5,dado);
        f6=contarDado(6,dado);
        
        System.out.println(Arrays.toString(dado));
        System.out.println("1: "+ f1 + " - " + ((double)f1/lanzamientos)*100+"%");
        System.out.println("2: "+ f2 + " - " + ((double)f2/lanzamientos)*100+"%");
        System.out.println("3: "+ f3 + " - " + ((double)f3/lanzamientos)*100+"%");
        System.out.println("4: "+ f4 + " - " + ((double)f4/lanzamientos)*100+"%");
        System.out.println("5: "+ f5 + " - " + ((double)f5/lanzamientos)*100+"%");
        System.out.println("6: "+ f6 + " - " + ((double)f6/lanzamientos)*100+"%");
    }
    
       public static int[] poblarResultados(int dado[]){
       int indMax= dado.length-1;
       
       for(int i=0;i<=indMax;i++){
            dado[i]=(int)(Math.random()*(6-1+1)+1);
       }
        
        return dado;
    }
        public static int contarDado(int val,int c[]){
      int cont=0;
      int indMax=c.length-1;
      
      for(int i=0;i<=indMax;i++){
          
          if(c[i]==val){
              cont++;
          }
      }
      return cont;
      } 
       
    
}
