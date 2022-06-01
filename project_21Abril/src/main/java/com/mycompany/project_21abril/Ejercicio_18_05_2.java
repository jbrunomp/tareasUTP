/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project_21abril;

import java.util.Scanner;

/**
 *
 * @author JOHN MENDOZA
 * Se tiene la serie: 1 – 2 + 3 – 4 + 5 – 6 + 7 – 8 …
Realizar un algoritmo que permita mostrar primeros términos de la serie e Imprimir la
suma de los términos mostrados.
 */
public class Ejercicio_18_05_2 {
    public static void main(String[] args) {
        int num,sum;
        boolean flag=true;
        
        Scanner scan=new Scanner(System.in);
        
        System.out.print("Ingrese el numero: ");
        
        num=scan.nextInt();
        String serie="";
        sum=0;
        for(int i=1;i<=num;i++){
        
           if(flag==true){
               sum=sum+i;
               //System.out.print("+"+i);
               serie=serie+"+"+i;
               flag=false;
           }else{
              // System.out.print("-"+i);
              serie=serie+"-"+i;
              sum=sum-i;
                flag=true;
           }            
        }
        System.out.println("La serie es: "+serie);
        System.out.println("La suma es: "+sum);
        
        
    }
}
