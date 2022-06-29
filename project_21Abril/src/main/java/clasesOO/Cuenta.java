/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasesOO;

/**
 *
 * @author JOHN MENDOZA
 */
public class Cuenta {
    
    String nomTitular;
    double cantidad;

    public Cuenta(String nomTitular, double cantidad) {
        this.nomTitular = nomTitular;
        this.cantidad = cantidad;
    }

    public String getNomTitular() {
        return nomTitular;
    }

    public void setNomTitular(String nomTitular) {
        this.nomTitular = nomTitular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "nomTitular=" + nomTitular + ", cantidad=" + cantidad + '}';
    }
    
    public void ingresar(double cant){
        if(cantidad<0){
            
        }else{
            this.cantidad=this.cantidad+cant;
        }
    }
    public void retirar(double cant){
        if((this.cantidad-cant)<0){
           this.cantidad=0; 
        }else{
            this.cantidad=this.cantidad-cant;
        }
    }
    
    
    
    
    
    
}
