/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasesOO;

/**
 *
 * @author JOHN MENDOZA
 */
public class Ejercicio_17_06_1 {
    
    public static void main(String[] args) {
          Perro fido=new Perro();
          fido.caminar();
          System.out.println(fido.nombre);
          fido.nombre="Fido";
          System.out.println(fido.nombre);
          
           System.out.println(fido.colorPelo);
           System.out.println(fido.cantidadOjos);
           
           fido.colorPelo="Gris";
           System.out.println(fido.colorPelo);

    }
  
    
    
    
}
