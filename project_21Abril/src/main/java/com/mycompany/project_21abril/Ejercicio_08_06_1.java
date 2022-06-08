/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project_21abril;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author JOHN MENDOZA
 * Un arreglo de números se llama partidario si todo número que está en una casilla par
(0,2,4,…) es mayor que cualquiera de los números que están en las casillas impares (1,3,5,…).
Escriba un algoritmo que lea un arreglo de números enteros y luego, diga si es partidario o
no. Por ejemplo, si el arreglo es el siguiente:
 */
public class Ejercicio_08_06_1 {
    
    public static void main(String[] args) {
        
        /*Ingreso de dimension*/
        int num;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de numeros: ");
        num=scan.nextInt();
        boolean partidario=true;
        
         int numeros[]= new int[num];
         numeros=llenaArreglo(numeros);
         int indMax=numeros.length-1;
         
          for(int i=0; i<= indMax;i=i+2){
              //System.out.println(compararPartidario(numeros,numeros[i])+"---"+numeros[i]);
              if(compararPartidario(numeros,numeros[i])){
                  partidario=true;
              }else{
                   partidario=false;
                   break;
              }
          }
           System.out.println(Arrays.toString(numeros));
          if(partidario==true){
              System.out.println("El arreglo de numeros es partidario");
          }else{
             System.out.println("El arreglo de numeros no es partidario"); 
          }
        
        
        
    }
    
     public static int[] llenaArreglo(int a[]){
       
        Scanner scan = new Scanner(System.in);
        int indMax=a.length-1;
        /* 7 Vueltas*/
        for(int i=0; i<= indMax;i++){
            System.out.println("Ingrese el numero "+ (i+1)+": ");
            a[i]=scan.nextInt();
  
        }
        return a;
    }
     
     public static boolean compararPartidario(int a[],int val){
         boolean flag=true;
          int indMax=a.length-1;
         
         for(int i=1; i<= indMax;i=i+2){
           
/*               1  < 100             */
             if(a[i]<val){
                 
                 flag=true;
                
             }else{
                 flag=false;
                  break;
             }
            
        }
         
         
         
         return flag;
 
     }
}
