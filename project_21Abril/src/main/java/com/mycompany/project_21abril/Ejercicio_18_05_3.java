/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project_21abril;

import java.util.Scanner;

/**
 *
 * @author JOHN MENDOZA
 * Calcule el valor de la siguiente serie para N términos:
 * 1+1/2+1/3+1/4+1/N
 */
public class Ejercicio_18_05_3 {
    
    
    public static void main(String[] args) {
        int num,cont=1;
        double suma=0;
        //double serie=0
        Scanner scan=new Scanner(System.in);
        
        System.out.print("Ingrese el numero: ");
        
        num=scan.nextInt();
        
        
        while(cont<=num){
            //serie= (double)1/cont;
            suma=suma+(double)1/cont;
            cont++;
        }
        System.out.print("La suma es: "+suma);
    }
}
