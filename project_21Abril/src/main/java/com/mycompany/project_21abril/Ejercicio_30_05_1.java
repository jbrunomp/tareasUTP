/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project_21abril;

import java.util.Scanner;


/**
 *
 * @author JOHN MENDOZA
 * Desarrolle un programa que almacene N ventas en un arreglo unidimensional y calcular el
umbral de ventas que está definido por el 60% del promedio de ventas. Al finalizar debe
mostrar las ventas que sean iguales o superiores al umbral
 */
public class Ejercicio_30_05_1 {
    
    
    public static void main(String[] args) {
        int n=50;
        double numeros[]= new double[n];
        numeros=llenaArreglo(numeros);
      
        String s_array="";
        for(int i=0;i<numeros.length;i++){
            s_array=s_array+numeros[i]+", ";
        }
        System.out.println("Array: "+s_array);
//System.out.println(Arrays.toString(numeros));
System.out.println("Umbral: "+0.6*hallaPromedio(numeros));
        System.out.println("Mayores Ventas: "+promedioMayor((0.6*hallaPromedio(numeros)),numeros));
        
        
    }
    
     public static double[] llenaArreglo(double a[]){
        /* Hallar la longitud del arreglo 
        7=Dimension del arreglo a[]
        a[0]
        a[1]
        a[2]
        */
         Scanner scan = new Scanner(System.in);
        int indMax=a.length-1;
        /* 7 Vueltas*/
        for(int i=0; i<= indMax;i++){
            a[i]=Math.round((Math.random()*(50-10+1)+10)*100.0)/100.0;
        /*   
        System.out.print("Ingresa el  numero: "+ (i+1)+": ");
        a[i]=scan.nextDouble();
        */    
  
        }
        return a;
    }
     public static double hallaPromedio(double a[]){
        int n=a.length; double promedio;
        double suma=sumaArreglo(a);
        promedio= (double)suma/n;
        return Math.round(promedio*100.0/100.0);
    }
      public static double sumaArreglo(double a[]){
        int indMax=a.length-1;double suma=0;
        for(int i=0; i<= indMax;i++){
            suma= suma +a[i];
        }
        return suma;
    }
      
      public static int promedioMayor(double prom,double c[]){
      int cont=0;
      int indMax=c.length-1;
      
      for(int i=0;i<=indMax;i++){
          
          if(c[i]>prom){
              cont++;
          }
      }
      return cont;
      }
}
