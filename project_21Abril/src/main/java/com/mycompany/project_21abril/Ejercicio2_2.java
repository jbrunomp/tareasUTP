/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.project_21abril;

import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class Ejercicio2_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String marca;int cant; double precioU=0,porctDscto=0,descto,totalPago,precioSinDescto; int error=0;
        System.out.print("Ingrese la marca(Donofrio/Motta/Todinno/Naval/Santa Claus/Doña Pepa) ");marca=scan.nextLine();
        marca= marca.toLowerCase(); 
        cant=(int)(Math.random()*(50-1+1)+1);
        switch(marca){
            case "donofrio":precioU=20;break;
            case "motta":precioU=19;break;
            case "todinno":precioU=18;break;
            case "naval":precioU=9;break;
            case "santa claus":precioU=11;break;
            case "doña pepa":precioU=10;break;
            default: error=1;
        }
        porctDscto=(cant > 20 ? 0.10:0);
//        if(cant > 20)
//            porctDscto=0.10;
//        else porctDscto=0;
        precioSinDescto=precioU*cant;
        descto= precioSinDescto*porctDscto;
        totalPago= precioSinDescto-descto;
        if(error==0){
            System.out.println("Paneton "+marca.toUpperCase()+ " Precio Unitario: "+precioU+ " cantidad "+cant);
            System.out.println("Precio sin descto "+precioSinDescto+" Descuento "+descto+" Precio Final "+totalPago );
        }
        else System.out.println("Error en el nombre del paneton");
    }
    
}
