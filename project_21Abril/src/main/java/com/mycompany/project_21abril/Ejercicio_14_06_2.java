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
 * Escriba un programa que lea de la entrada un número y utilice ese número para crear un
array de enteros de ese tamaño. A continuación, el programa inicializará el array con los
valores que el usuario introduzca por la entrada. Finalmente, se deberá recorrer el array e
imprimir tantos caracteres ‘*’ como indique el valor de cada elemento que sean un numero
primo del array. Ejemplo: los valores 7,13,11,22 producirán la siguiente salida:
*******
***********
 */
public class Ejercicio_14_06_2 {
    
    
    public static void main(String[] args) {
        
    
        int num;
     String cadena="";
       Scanner scan = new Scanner(System.in);
         System.out.print("Ingrese el tamaño del array : ");
       num=scan.nextInt();
       
       int array[]= new int[num];
       
       array=poblarValores(array);
     
       int indMax= array.length-1;
        //System.out.println(Arrays.toString(array));
       for(int i=0;i<=indMax;i++){
          
            if(esPrimo(array[i])){
                System.out.println(poblarAsteriscos(array[i]));
            }else{
                System.out.println(array[i]);
            }
            
            
       } 
        
       //System.out.println(cadena);
    }
    
    public static int[] poblarValores(int array[]){
       int indMax= array.length-1;
       Scanner scan = new Scanner(System.in);
       
       for(int i=0;i<=indMax;i++){
           System.out.print("Ingrese el valor "+(i+1)+": ");
            array[i]=scan.nextInt();
            
            
       }
        
        return array;
    }
      public static boolean esPrimo(int numero){

        boolean primo= true; 
        int cont= 2;
/*El numero es primo es divisible entre 1 y el mismmo numero
    1,2,3
        
        */

        while(cont < numero ){

            if ( numero % cont == 0){

                primo = false;

            }

            cont++;

        }

        return primo;

    }
      
      public static String poblarAsteriscos(int num){
          String cadena="";
          int cont=0;
          while(cont<num){
              cadena=cadena+"*";
              cont++;
          }
          
          
          return cadena;
          
      }
}
