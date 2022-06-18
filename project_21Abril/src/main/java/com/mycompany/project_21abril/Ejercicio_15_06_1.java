/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project_21abril;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author JMENDOZA
 */
public class Ejercicio_15_06_1 {
    
    public static void main(String[] args) {
        
        //poblar la matriz
        int n=10;
        int encuesta[]= new int[n];
        
        encuesta=poblarEncuesta(encuesta);
         System.out.println("*****RESULTADOS DE ENCUESTA*****");
         System.out.println("Estudiantes encuestados:"+ hallarTotalEncuestados(encuesta));
         System.out.println("Calificación\tnúm. Estudiantes\tHistograma");
         
          int indMax= encuesta.length-1;
       
       for(int i=0;i<=indMax;i++){
           
        System.out.println("\t"+(i+1)+"\t\t"+ encuesta[i] +"\t\t"+poblarAsteriscos(encuesta[i])); 
       }
         
    }
    
    public static int[] poblarEncuesta(int encuesta[]){
        
        
        int contAl=0;
        int escala=1;
        Scanner scan = new Scanner(System.in);
        
        while(escala!=0){
             System.out.print("Ingrese la escala del alumno "+(contAl+1)+": ");
            escala=scan.nextInt();
            //validacion
            if(escala>=0&&escala<=10){
 
            if(escala!=0){
            encuesta[(escala-1)]=encuesta[(escala-1)]+1;
            }
            contAl++;
            }else{
              System.out.print("Error en el intervalo de la encuesta.");  
            }
        }
   
        return encuesta;
    }
     public static int hallarTotalEncuestados(int encuesta[]){
         
        int contAl=0; 
        
        int indMax= encuesta.length-1;
       
       for(int i=0;i<=indMax;i++){
            contAl=contAl+encuesta[i];
       }
        
        
        return contAl;
     }
     
     public static String poblarAsteriscos(int num){
          String cadena="";
          int cont=0;
          while(cont<num){
              cadena=cadena+"*";
              cont++;
          }
          
          
          return cadena;
          
      }
    
}
