/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project_21abril;

import java.util.Scanner;

/**
 *
 * @author JMENDOZA
 * SI UN NUMERO INGRESADO ES MULTIPLO DE 10
 */
public class Ejercicio_16_5_2 {
    
    public static void main(String[] args) {
        int numero; 
  
        Scanner scan = new Scanner(System.in);
        
/* TEXTO INFORMATIVO */
        System.out.print("Ingresar Numero ahora: ");
        
/* INGRESO DE TEXTO O VALOR */   
        numero=scan.nextInt();
        
        if(numero%10==0){
             System.out.print("El numero ingresado es multiplo de 10");
        }else{
            System.out.print("El numero ingresado es no multiplo de 10");
        }
        
    }
    
}
