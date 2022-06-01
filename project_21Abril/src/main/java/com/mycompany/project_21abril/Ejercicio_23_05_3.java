/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project_21abril;

import java.util.Scanner;

/**
 *
 * @author JMENDOZA
 * Determinar el cociente entero de la división de 2 números naturales por el método de restas
sucesivas hasta que la última diferencia sea menor al divisor.
13 / 3
 */
public class Ejercicio_23_05_3 {
    
    public static void main(String[] args) {
        
        int num1, num2;
        int cociente=0;
         Scanner scan = new Scanner(System.in);
        
        System.out.print("Ingresa el primer numero: ");
        num1=scan.nextInt();
        System.out.print("Ingresa el segundo numero: ");
        num2=scan.nextInt();
        
        while(num1>=num2){
           num1=num1-num2; 
 
          cociente++;  
        }
        //resto=num1-num2;
        System.out.println("El cociente es: "+cociente);
        System.out.println("El residuo es: "+num1);
    }
}
