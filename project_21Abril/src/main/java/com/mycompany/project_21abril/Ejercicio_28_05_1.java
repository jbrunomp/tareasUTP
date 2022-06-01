/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project_21abril;

import java.util.Scanner;

/**
 *
 * @author JOHN MENDOZA
 */
public class Ejercicio_28_05_1 {
    public static void main(String[] args) {
         int num=0,num2=0,cociente=0,resto=0,cont=1,num_inicial=0;
         
         Scanner scan = new Scanner(System.in);
       /// int numeros[]= new int[];
        System.out.print("Ingresa el  numero: ");
        num_inicial=scan.nextInt();
        //243
        
     /*DIMESION DEL ARREGLO*/  
        num=num_inicial;
        
       while(num>10){
           cociente=num/10;
           num=cociente;
           //System.out.println("cociente: "+cociente); 
           cont++;
       }
       
       System.out.println("Dimension: "+cont);
      /*FIN*/ 
   /*POBLAR EL ARREGLO*/    
       int nums[]=new int[cont];
       nums[0]=num;
      
       num2=num_inicial;
  
        //234
         while(cont>1){
           cociente=num2/10;
           //cociente=23
           //resto=4
           resto=num2%10;
           num2=cociente;

           nums[cont-1]=resto;
     //nums[1] =3
//cont=cont-1;

           cont--;
       }
     
     /*MOSTRAR EL ARREGLO*/   
         String s_array="";
        for(int i=0;i<nums.length;i++){
            s_array=s_array+nums[i]+", ";
        }
        System.out.println("Array: "+s_array);
       
    }
}
