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
 * Escriba un programa, que declare un arreglo de enteros e inicialice con valores aleatorios los
muestre en pantalla, pida ingresar dos valores enteros que corresponden a dos posiciones
del arreglo. El programa debe intercambiar los valores enteros en esas 2 posiciones. Por
ejemplo, si el arreglo A tuviese los valores A={8,1,4,7,5,10,6,3,9}, al introducir los valores 2 y
5, se intercambia los valores A[2] y A[5], modificando el arreglo de la siguiente forma: A=
{8,1,10,7,5,4,6,3,9}
 */
public class Ejercicio_08_06_2 {
    
    public static void main(String[] args) {
        
         int n=10,ind1,ind2;
        int numeros[]= new int[n];
        numeros=llenaArreglo(numeros);
        System.out.println(Arrays.toString(numeros));
        
         Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingrese la primera posicion: ");
        ind1=scan.nextInt();
        /* 1*/
        System.out.println("Ingrese la segunda posicion: ");
        ind2=scan.nextInt();
        /* 2*/
        
        if(ind1<n && ind2<n){
             System.out.println(Arrays.toString(reemplazoArreglo(numeros,ind1, ind2)));   
        }else{
         System.out.println("El valor ingresado es mayor a la dimension del arreglo");
       
        }
    }
    public static int[] reemplazoArreglo(int a[],int pos1, int pos2){
        
        int indMax=a.length-1;
        int val1,  val2;
        val1=a[pos1];
        val2=a[pos2];

        a[pos1]=val2;
        a[pos2]=val1;
       

        return a;
    }
    
      public static int[] llenaArreglo(int a[]){
       
         Scanner scan = new Scanner(System.in);
        int indMax=a.length-1;
       
        for(int i=0; i<= indMax;i++){
            a[i]=(int)(Math.random()*20);
          
        }
        return a;
    }
}
