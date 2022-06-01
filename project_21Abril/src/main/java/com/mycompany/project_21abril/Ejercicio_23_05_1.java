/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project_21abril;

/**
 *
 * @author JMENDOZA
 * Tablas de Multiplicar del 1 al 10
 */
public class Ejercicio_23_05_1 {
    
    public static void main(String[] args) {
        //Variables de Proceso
        int cont1=1,cont2=1;
        int lim1=12,lim2=20;
        
        //Proceso
        do {   
            cont1=1;
            do {                
                System.out.print(cont2+"x"+cont1+"="+(cont2*cont1)+" ");
                cont1++;
            } while (cont1<=lim1);
            
           System.out.println("");
           cont2++;
        } while (cont2<=lim2);
    }
}
