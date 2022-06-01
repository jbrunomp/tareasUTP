/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project_21abril;


/**
 *
 * @author JOHN MENDOZA
 */
public class Ejercicio_25_05_3 {
    
    public static void main(String[] args) {
        
        int n=10;
        int num[]=new int[n];
        int sumtotal=0;
        num=poblarArreglo(num);
        int indMax= num.length-1;
        for(int i=0;i<=indMax;i++){
            if(espar(num[i])==true){
               sumtotal= sumtotal+num[i];
            }else{
                sumtotal= sumtotal-num[i];
            }
             
        }
        
        System.out.println("El valor total es: "+sumtotal);
    }
    
    
     public static int[] poblarArreglo(int num[]){
       int indMax= num.length-1;
       
       for(int i=0;i<=indMax;i++){
            num[i]=(int)(Math.random()*(10-1+1)+1);
       }
        
        return num;
    }
     
     public static boolean espar(int num){
         boolean fl=true;
         /*
         DETERMINAR SI ES PAR
         */
         return fl;
     }
}
