/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project_21abril;

import java.util.Scanner;

/**
 *
 * @author JMENDOZA
 Ingresar 3 notas y obtener el promedio. Mostrar si el alumno aprobo o no el curso
12 APRUEBAS
*/
public class Ejercicio_16_5_3 {
    public static void main(String[] args) {
        int numero1; 
        int numero2;
        int numero3;
        double promedio;
        /*INGRESO DE NUMEROS */
        Scanner scan = new Scanner(System.in);
       
        System.out.print("Ingresar Numero 1 ahora: ");
 
        numero1=scan.nextInt();
        System.out.print("Ingresar Numero 2 ahora: ");
 
        numero2=scan.nextInt();
        System.out.print("Ingresar Numero 3 ahora: ");
 
        numero3=scan.nextInt();
        
        promedio=(numero1+numero2+numero3)/3;
        
        if(promedio>=12){
           System.out.print("La Alumna esta aprobada"); 
        }else{
          System.out.print("La Alumna esta desaprobada");   
        }
            
        

    }
}
