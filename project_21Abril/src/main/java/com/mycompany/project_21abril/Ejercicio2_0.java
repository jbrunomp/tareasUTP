/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.project_21abril;

import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class Ejercicio2_0 {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String editorial,comprador; double precio,porctDscto=0, dscto, precioFinal;
        System.out.print("Editorial (San marcos/covenas/otros) ");editorial=scan.nextLine();
        System.out.print("Comprador (estudiante/publico ");comprador=scan.nextLine();
        System.out.print("Precio ");precio=scan.nextDouble();
        editorial=editorial.toLowerCase();
        comprador= comprador.toLowerCase();
        
        switch(editorial){
            case "san marcos":{
                switch(comprador){
                    case "estudiante":porctDscto=0.25; break;
                    case "publico":porctDscto=0.10; break;
                }
                break;
            }
            case "covenas":{
                switch(comprador){
                    case "estudiante":porctDscto=0.30; break;
                    case "publico":porctDscto=0.13; break;
                }
                break;
            } 
            case "otros":{
                switch(comprador){
                    case "estudiante":porctDscto=0.35; break;
                    case "publico":porctDscto=0.16; break;
                }
                break;
            }            
        }
        dscto=precio*porctDscto;
        precioFinal= precio-dscto;
        
        System.out.println("Editorial "+ editorial+"\t Comprador "+comprador);
        System.out.println("Precio "+precio+"\t Descuento "+dscto+"\t Precio Final "+precioFinal);
    }
}
