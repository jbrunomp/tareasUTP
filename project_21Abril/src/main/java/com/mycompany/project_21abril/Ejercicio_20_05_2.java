/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project_21abril;

import java.util.Scanner;

/**
 *
 * @author JOHN MENDOZA
 4.1. Se ha seleccionado N números de personas para realizar una encuesta, en un proceso
repetitivo se ingresa el grado de instrucción (1-Primaria/2-Secundaria/3-Superior) y la edad
(entre 15 y 80 años) de cada persona. Obtener la edad y el grado de instrucción usando
Math.random
Construya un programa que muestre lo siguiente:
* a) El promedio de edades
b) La mayor edad.
c) Cantidad de Personas con instrucción Primaria
d) Cantidad de Personas con instrucción Secundaria.
e) Cantidad de Personas con instrucción Superior.
 
 */
public class Ejercicio_20_05_2 {
    
    
    public static void main(String[] args) {
        
   
    /*VARIABLES DE ENTRADA*/
    int n;
    /*VARIABLES DE PROCESO*/
    int edad,gInstruccion,sumEdades=0;
    
    /*VARIABLES DE SALIDA*/
    double promEdades;
    int edadMayor=0,cantIPrim=0,cantISec=0,cantISup=0;
    
     /*PASO 1 INGRESO DE INFORMACION*/
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese el número de personas: ");
        n = Integer.parseInt(scan.nextLine());
    
     /*PASO 2 PROCESO*/   
        for(int i=1;i<=n;i++){
            
           gInstruccion=(int)(Math.random()*3);
            System.out.println("El GI "+i+"es: "+gInstruccion);
  /*2*/
           if(gInstruccion==0){
            cantIPrim++;
            }else if(gInstruccion==1){
            cantISec++;
            }else{
             cantISup++;
            }
            
           edad=(int)(Math.random()*(100-1+1)+1);
            System.out.println("El edad "+i+"es: "+edad);
       /*21*/      
           sumEdades=sumEdades+edad;
          
          /* EDAD MAYOR*/ 
           if(edadMayor<edad){
              edadMayor=edad; 
           }
            
        }
     /* PROMEDIO DE EDADES*/ 
        promEdades=(double)sumEdades/n;
     
    System.out.println("El promedio de edades es: "+promEdades);
    System.out.println("La mayor edad es : "+edadMayor);
     System.out.println("Cantidad de Personas con instrucción Primaria : "+cantIPrim);
    System.out.println("Cantidad de Personas con instrucción Secundaria : "+cantISec);
      System.out.println("Cantidad de Personas con instrucción Superior : "+cantISup);

    }
    
}
