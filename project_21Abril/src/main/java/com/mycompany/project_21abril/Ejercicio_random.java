/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project_21abril;

/**
 *
 * @author JMENDOZA
 */
public class Ejercicio_random {
    
    public static void main(String[] args) {
        int min=2;
        int max=15;
 
        int rdm=(int)(Math.random()*(max-min+1)+min);
        /*3*/
        
        while(rdm%2!=0){
         /*rdm=5*/      
            rdm=(int)(Math.random()*(max-min+1)+min);
         /*rdm=6*/         
        }
        System.out.print("El número aletorio es: "+rdm);
     
    }
    
}
