/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project_21abril;

/**
 *
 * @author JOHN MENDOZA
 */
public class Ejercicio_28_05_2 {
      public static int[] llenaArreglo(int a[]){
        /* Hallar la longitud del arreglo 
        7=Dimension del arreglo a[]
        a[0]
        a[1]
        a[2]
        */
        
        int indMax=a.length-1;
        /* 7 Vueltas*/
        for(int i=0; i<= indMax;i++){
            a[i]=(int)(Math.random()*(50-10+1)+10);
            /*a[0]= Aleatorio 1era Vuelta*/
            /*a[1]= Aleatorio 2da Vuelta*/
            /*a[2]= Aleatorio 3ra Vuelta etc*/
        }
        return a;
    }
    public static int sumaArreglo(int a[]){
        int indMax=a.length-1;int suma=0;
        for(int i=0; i<= indMax;i++){
            suma= suma +a[i];
        }
        return suma;
    }
public static double hallaPromedio(int a[]){
        int n=a.length; double promedio;
        int suma=sumaArreglo(a);
        promedio= (double)suma/n;
        return promedio;
    }
  
    public static void main(String[] args) {
        int n=7;
        int numeros[]= new int[n];
        numeros=llenaArreglo(numeros);
      
        String s_array="";
        for(int i=0;i<numeros.length;i++){
            s_array=s_array+numeros[i]+", ";
        }
        System.out.println("Array: "+s_array);
//System.out.println(Arrays.toString(numeros));
        System.out.println("SUMA: "+sumaArreglo(numeros));
        System.out.println("Promedio: "+hallaPromedio(numeros));
        System.out.println("Mayor: "+hallaMayor(numeros));
        System.out.println("Menor: "+hallaMenor(numeros));
    }
  public static int hallaMayor(int a[]){
        int indMax=a.length-1;int mayor=0;
        for(int i=0; i<= indMax;i++){
            if(a[i]> mayor)
                mayor = a[i];
        }
        return mayor;
    }
  
  public static int hallaMenor(int a[]){
      int indMax=a.length-1;int menor=a[0];
      
      for(int i=0;i<=indMax;i++){
          
          if(a[i]<menor){
              menor=a[i];
          }
      }
      return menor;
  }
  
  
}
