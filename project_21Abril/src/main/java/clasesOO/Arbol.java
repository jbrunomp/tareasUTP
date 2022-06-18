/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasesOO;

/**
 *1.- Cree una clase Arbol con metodos: crecer(), crearHojas() y
fotosintesis(). También debe tener los atributos cantidadHojas,
tipo, antigüedad, altura. Cree un objeto en base a este y pruebe
los atributos y métodos.
 * @author JOHN MENDOZA
 */
public class Arbol {
    
    //atributos
    int cantidadHojas;
    String tipo;
    int antiguedad;
    double altura;
    
    //metodos
    void crecer(){
        System.out.println("Estoy creciendo");
    }
    
    void crearHojas(){
         System.out.println("Agregando una hoja mas");

    }
    void fotosintesis(){
                System.out.println("Buscando el sol");

    }
    
    Arbol(){
       this.cantidadHojas=(int)(Math.random()*1000);
       this.tipo="Ficus";
       this.antiguedad=10;
       this.altura=15.64;
    }
    
}
