/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project_21abril;

import java.util.Scanner;

/**
 *
 * @author 
 * Programa que muestre y determine la cantidad de números pares comprendidos
entre dos números enteros A y B: A ≤ #PARES ≤ B
 */
public class Ejercicio_18_05_1 {
    
  
    public static void main(String[] args) {
        
        /*INGRESO DE DATOS*/
        int num1,num2,contador;
        contador=0;
        Scanner scan=new Scanner(System.in);
        
        System.out.print("Ingrese el primer numero: ");
        
        num1=scan.nextInt();
        
        System.out.print("Ingrese el segundo numero: ");
        
        num2=scan.nextInt();
        
        /*PROCESO*/
        System.out.println("Los numeros pares comprendidos entre "+num1+" y "+num2+ " son: ");
    
        for(int i=num1;i<=num2;i++){
        
       /*SI ES PAR VAS A MOSTRARSE*/
        if(i%2==0){
            System.out.println(i);
            contador++;
        }
        
        
        }
        System.out.println("La cantidad de numeros es: "+contador);
        
        
        
    }
    
}
