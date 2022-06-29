/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasesOO;

/**
 *
 * @author JOHN MENDOZA
 */
public class Arreglo {
    
    int[] arreglo;

    public Arreglo(int dimension) {
        this.arreglo = new int[dimension];
    }
    
    public void llenarArreglo(){
       
        int indMax=arreglo.length-1;
        /* 7 Vueltas*/
        for(int i=0; i<= indMax;i++){
            arreglo[i]=(int)(Math.random()*20);
           
        }
     
    }

    @Override
    public String toString() {
        return "Arreglo{" + "arreglo=" + arreglo + '}';
    }
    
    public int operacion(int x){
        int suma=0;
        
        int indMax=arreglo.length-1;
        for(int i=0; i<= indMax;i++){
           if(arreglo[i]>x){
               suma=suma+arreglo[i];
           }else{
               suma=suma-arreglo[i];
           }
           
        }
    
        return suma;
    }
}
