/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project_21abril;

import java.util.Scanner;



/**
 *
 * @author JMENDOZA
 Si EL  NUMERO INGRESADO ES PAR O IMPAR
 */
public class Ejercicio_16_5_1 {
   /*
    Desarrollar un numero si es par o no par*/
    public static void main(String[] args) {
        
        int numero; 
   

        Scanner scan = new Scanner(System.in);
        
/* TEXTO INFORMATIVO */
        System.out.print("Ingresar Numero ahora: ");
        
/* INGRESO DE TEXTO O VALOR */   
        numero=scan.nextInt();
        
        if(numero%2==0){
            System.out.print("El numero ingresado es par");
        }else{
          System.out.print("El numero ingresado es impar");  
        }
        
    }
        
}
