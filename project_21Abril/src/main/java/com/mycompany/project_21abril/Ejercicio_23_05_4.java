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
public class Ejercicio_23_05_4 {
    
    
    public static int converToNumero(String num){
        return Integer.parseInt(num);
    }
   
    public static void main(String[] args) {
        
     int num2;
    String num1,s_num1;
    boolean fl=true;
    
       Scanner scan = new Scanner(System.in);
        
        System.out.print("Ingresa el numero: ");
         num1=scan.nextLine();
        System.out.print("Ingresa la base númerica: ");
        num2=scan.nextInt();
        
        for(int i=0;i<num1.length();i++){
           // System.out.print(converToTexto(num1).charAt(i));
           //
           s_num1=String.valueOf(num1.charAt(i));
          // s_num1= Character.getNumericValue();
        System.out.println("Compara:"+(num1.charAt(i))+ " con " +num2);
           if(converToNumero(s_num1)<num2){
               
               fl=true;
            }else{
               fl=false;
              break;
           }
        }
        
        
        if(fl==true){
                System.out.print("El numero pertenece a esa base");
            }else{
                System.out.print("El numero no pertenece a esa base");
           }
        
        
    }
}
