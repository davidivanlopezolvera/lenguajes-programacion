/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo6.threads;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author T-101
 */
public class ProbarMisThreads implements Runnable{
    public static void main(String[] args) {
        //ciclo de vida de los threads sin contar pausa 
        //1. creado 
        MiPrimerThreads t1=new MiPrimerThreads();
        //otro thread
        Runnable r=new ProbarMisThreads(); 
        Thread t2=new Thread(r); 
        Thread t3=new Thread(r); 
        
        //el thread t2 tiene que hacer que se impriman del 1 al 10
        //de 5 segundos entre impresion 
        //el thread t3 tiene que hacer qye se imprima 
        //la frase "todos vamos a morir!!" hasta el final de los tiempos 
        //cada segundo 
        
        
        
        
        //opcionalmente lo bautizamos 
        t1.setName("IV@N");
        t2.setName("david");
        t3.setName("lopez");
        //2. inicializado 
        t1.start();
        t2.start();
        t3.start();
        
        //3.en ejecucion (cuando corras este programa va estar en estado de ejecucion )
        //active su modo run 
        
        //5. merte: cuando complete la tarea que tiene el codigo del metodo run 
        
    }

    @Override
    public void run() {
    //primero preguntamos si es el thread t2 y si e imprime del 1 al 10 
        
        if (Thread.currentThread().getName().equals("david")) {
            int x=1;
            for(int i=0;i<50;i++){
                System.out.println(x++); 
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ProbarMisThreads.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
        } if (Thread.currentThread().getName().equals("lopez")) {
            while(true){
                System.out.println("todos vamos a moriiiiiiir!!");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ProbarMisThreads.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
           
                  
    }
    
}
}
