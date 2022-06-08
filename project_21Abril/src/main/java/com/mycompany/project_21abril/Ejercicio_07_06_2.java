/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project_21abril;

import java.util.Scanner;

/**
 *
 * @author JOHN MENDOZA
 * Construya un algoritmo que lea una frase del español de máximo 100 caracteres y determine
cuántas vocales tiene.
 */
public class Ejercicio_07_06_2 {
    public static void main(String[] args) {
         String frase,s_letra;
         int cont=0;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingrese la frase: ");
         frase=scan.nextLine();
         
         if(frase.length()>100){
              System.out.println("La frase tiene mas de 100 de caracteres");
         }else{
             /*RECORRER LA FRASE*/
             for(int i=0;i<frase.length();i++){
                 s_letra=String.valueOf(frase.charAt(i));
                if(esVocal(s_letra)){
                    cont++;
                }
             

             }
             System.out.println("La cantidad de vocales es: "+cont);
         }
    }
    
    public static boolean esVocal(String valor){
        boolean flag=true;
        
        if(valor.equalsIgnoreCase("a") || valor.equalsIgnoreCase("e")||valor.equalsIgnoreCase("i") || valor.equalsIgnoreCase("o")|| valor.equalsIgnoreCase("u")){
            flag=true;
        }else{
            flag=false;
        }
        
        return flag;
    }
}
