/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project_21abril;

import java.util.Scanner;

/**
 *
 * @author JOHN MENDOZA
 * 
 * 2. Generar un arreglo con números aleatorios entre 0 y 20 para una clase de n alumnos y
mostrarlos en pantalla, de acuerdo con la nota obtenida debe indicar cuántos estudiantes
son:
Deficientes 0-5
Irregulares 6-11
Regulares 12-14
Buenos 15-17
Excelentes 18-20
 */
public class Ejercicio_03_06_1 {
 public static void main(String[] args) {
         
      int n=0;
        Scanner scan=new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de alumnos: ");
        
        n=scan.nextInt();
      
        int numeros[]= new int[n];
        numeros=llenaArreglo(numeros);
      
        String s_array="";
        for(int i=0;i<numeros.length;i++){
            s_array=s_array+numeros[i]+", ";
        }
        System.out.println("Array: "+s_array);
     System.out.println("Alumnos Deficientes: "+contarArray(numeros,0,5));
     System.out.println("Alumnos Irregulares: "+contarArray(numeros,6,11));
 System.out.println("Alumnos Regulares: "+contarArray(numeros,12,14));
  System.out.println("Alumnos Buenos: "+contarArray(numeros,15,17));
   System.out.println("Alumnos Excelentes: "+contarArray(numeros,18,20));
    }
 
 public static int[] llenaArreglo(int a[]){
      
        int indMax=a.length-1;
        String valor;
        
        for(int i=0; i<= indMax;i++){
             a[i]=(int)(Math.random()*20);
  

      }
            
        return a;
    }
 
 public static int contarArray(int numeros[],int min,int max){
     int cont=0;int indMax=numeros.length-1;
      for(int i=0; i<= indMax;i++){
            if(numeros[i]>=min && numeros[i]<=max){
                cont++;
            }
  

      }
     return cont;
 }
}
