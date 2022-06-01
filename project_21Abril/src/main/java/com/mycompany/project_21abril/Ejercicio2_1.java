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
public class Ejercicio2_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String facultad; double matricula=0,mensualidad=0,precioFinal;int error=0;
        System.out.print("Ingrese su facultad (Sistemas/Derecho/Naviera/Pesquera/Contabilidad) ");facultad=scan.nextLine();
        facultad= facultad.toLowerCase(); 
        switch(facultad){
            case "ing. sistemas":
            case "sistemas": matricula=350;mensualidad=590;break;
            case "derecho": matricula=300;mensualidad=550;break;
            case "naviera": matricula=300;mensualidad=500;break;
            case "pesquera": matricula=310;mensualidad=550;break;
            case "contabilidad": matricula=280;mensualidad=490;break;
            default: error=1; 
        }
        precioFinal=matricula+mensualidad;
        if(error == 0){
            System.out.println("Su facultad: \t\t\t"+facultad.toUpperCase());
            System.out.println("El precio de matricula es: \t"+matricula);
            System.out.println("El precio de mensualidad es: \t"+mensualidad);
            System.out.println("El precio total a pagar es: \t"+precioFinal);
        }
        else System.out.print("Ingrese una facultad valida. ");
    }
}
