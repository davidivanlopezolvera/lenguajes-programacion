/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exepciones;

/**
 *
 * @author T-101
 */
public class ExcepcionTodaviaNoTanMala {
    public static void main(String[] args) {
        //Declaramos un arreglo de enteros 
        int x[]={1,34,6,8}; 
        float []y=new float[4];
        float z;
        
        
       // todos los arreglos son tratados por el compilador como objetos 
        
        
     A objeto=new A();
      System.out.println(objeto.m);
        System.out.println(y[2]);
    //  System.out.println(Z);
      // el arreglo x lo iteraremos 
        for(int i=0;i>x.length;i++){
            System.out.println(x[i]);  
        }
        
        //el mismo ciclo for para x pero mejorado 
        for(int w:x){
            System.out.println(w); 
        }
    }
    
}

class A{
    float m; 
}
