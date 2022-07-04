/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasesOO;

/**
 *
 * @author JOHN MENDOZA
 */
public class Raices {
    
    int a,b,c;

    public Raices(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public Raices() {
     
    }
    public String calcularSolucion(){
    double sol1,sol2;
    String txt;
    
    
   sol1=(-b+Math.sqrt(Math.pow(b, 2)-(4*a*c)))/(2*a);
   sol2=(-b-Math.sqrt(Math.pow(b, 2)-(4*a*c)))/(2*a);
   
   
     txt="El resultado es: Solucion 1="+sol1+" y la Solucion 2 es:"+sol2;
    
    return txt;
        
    }

    public double getDiscriminante(){
        double dis;
        
        dis=Math.pow(b, 2)-(4*a*c);
        
        return dis;
    }
    public boolean tieneRaices(){
        boolean flag;
        
        if(getDiscriminante()>=0){
            flag=true;
        }else{
             flag=false;
        }
 
        return flag;
        
    }
    public boolean tieneRaiz(){
        boolean flag;
        
        if(getDiscriminante()==0){
            flag=true;
        }else{
             flag=false;
        }
 
        return flag;
    }
    
    
    @Override
    public String toString() {
        return "Raices{" + "a=" + a + ", b=" + b + ", c=" + c + '}';
    }
    
    
            
}
