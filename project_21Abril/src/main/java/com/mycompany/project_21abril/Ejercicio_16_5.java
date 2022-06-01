/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project_21abril;

import java.util.Scanner;

/**
 *
 * @author JMENDOZA
 */
public class Ejercicio_16_5 {
    
    
    public static boolean esPrimoxxx(int numero){

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

    public static void main(String[] args) {

        int numero; 
   

        Scanner scan = new Scanner(System.in);
        
/* TEXTO INFORMATIVO */
        System.out.print("Ingresar Numero ahora: ");
        
/* INGRESO DE TEXTO O VALOR */   
        numero=scan.nextInt();
        
/* OPERACION SI Y SINO*/

        if(esPrimoxxx(numero)== true)

            System.out.println("El numero "+ numero+" ES PRIMO");

        else

            System.out.println("El numero "+ numero+" NO ES PRIMO");

    }
}
