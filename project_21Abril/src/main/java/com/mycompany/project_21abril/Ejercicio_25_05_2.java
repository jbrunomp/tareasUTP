/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project_21abril;



/**
 *
 * @author JOHN MENDOZA
 * Escriba un programa que almacene numeros aleatorios en un arreglo. 
 * Mostrar los numeros del arreglo. Mostrar el menor valor y la cantidad de veces 
 * que aparece en el arreglo. Lo mismo para el mayor valor
 */
public class Ejercicio_25_05_2 {
    public static void main(String[] args) {
       
        int n=10;
        int num[]=new int[n];
        int mayor,menor;
        num=poblarArreglo(num);
      mayor=hallaMayor(num);
        menor=hallaMenor(num);
        String s_array="";
        for(int i=0;i<num.length;i++){
            s_array=s_array+num[i]+", ";
        }
        System.out.println("Array: "+s_array);
        //System.out.println(Arrays.toString(numeros));
         System.out.println("Mayor: "+mayor);
         System.out.println("Cantidad de Veces del Mayor: "+cantVeces(num,mayor));
         
        System.out.println("Menor: "+menor);
            System.out.println("Cantidad de Veces del Menor: "+cantVeces(num,menor));
    }
    public static int cantVeces(int num[],int valor){
         int indMax= num.length-1;
         int cont=0;
         
         for(int i=0; i<=indMax;i++){
             if(num[i]==valor){
                 cont++;
             }  
         }

        return cont;
    }
    
    
    public static int[] poblarArreglo(int num[]){
       int indMax= num.length-1;
       
       for(int i=0;i<=indMax;i++){
            num[i]=(int)(Math.random()*(10-1+1)+1);
       }
        
        return num;
    }
    public static int hallaMayor(int a[]){
        int indMax=a.length-1;int mayor=0;
        for(int i=0; i<= indMax;i++){
            if(a[i]> mayor)
                mayor = a[i];
        }
        return mayor;
    }
    public static int hallaMenor(int a[]){
      int indMax=a.length-1;int menor=a[0];
      
      for(int i=0;i<=indMax;i++){
          
          if(a[i]<menor){
              menor=a[i];
          }
      }
      return menor;
  }
}
