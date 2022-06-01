/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project_21abril;

/**
 *
 * @author JMENDOZA
 */
public class Ejercicio_23_05_2 {
    
    public static String generaTabla(int tope){
        int n=1,multiplicacion,i=1; String cadena="";
        while (n<=10){
            i=1;
            while (i<=10){
                multiplicacion=n*i;
                cadena = cadena+ (n+" * "+i+" = "+multiplicacion)+"\n";
                i++;
            }
          n++;
        }
        return cadena;
    }
    public static void main(String[] args) {
          int tope=10;
          System.out.println(generaTabla(tope));
    }

}
