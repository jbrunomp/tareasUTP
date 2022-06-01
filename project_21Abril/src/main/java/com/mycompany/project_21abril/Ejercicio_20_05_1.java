/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project_21abril;

import java.util.Scanner;

/**
 *
 * @author JOHN MENDOZA
 * Ingresa un numero y enumera los anteriores
 */
public class Ejercicio_20_05_1 {

    public static void main(String[] args) {
        int num, cont = 1;
        Scanner ingreso = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        num = Integer.parseInt(ingreso.nextLine());
        
        //10
       
        /* SE VA A REPETIR VARIAS VECES LA CONDICION CUMPLE "N VECES" */
        /* while(11<=num){
            System.out.println(cont);
            cont++;
        }        }

       /*DO WHILE UNA VEZ Y LUEGO SE VA A REPETIR SI CUMPLE LA CONDICION
        */ 
      
       do {            
          System.out.println(cont);
            cont++;  
        } while (11<=num);
        
   
        
    }
}
