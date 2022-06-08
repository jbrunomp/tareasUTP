/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ll;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author usr
 */
public class Ejercicio_07_06_1 {

    public static void main(String[] args) {
        int num, n=1, cont = 0;
        Scanner ingreso = new Scanner(System.in);
        System.out.print("Ingrese el valor de N: ");
        num = Integer.parseInt(ingreso.nextLine());
        int numeros[]= new int[num];
        while (cont<num) { 
            if (esPrimoxxx(n)){
            numeros[cont]=n;    
            cont++;
            
            } 
            n++;
            
        }
        System.out.println(Arrays.toString(numeros));
        
    }
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
}
