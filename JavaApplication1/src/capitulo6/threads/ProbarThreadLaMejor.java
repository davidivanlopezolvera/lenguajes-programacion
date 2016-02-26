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
public class ProbarThreadLaMejor {
    //esta es la forma numero 3, LAMEJOR!!!
    public static void main(String[] args) {
        
        
        Thread t2=new Thread(new Runnable(){

            @Override
            public void run() {
                int x=1;
            for(int i=0;i<50;i++){
                System.out.println(x++); 
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ProbarMisThreads.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
                
            }
            
        });
        
         Thread t3=new Thread(new Runnable(){

            @Override
            public void run() {
                 while(true){
                System.out.println("todos vamos a moriiiiiiir!!");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ProbarMisThreads.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
                
            }
            
        });
        
        t2.start();
        t3.start();
        //una clase interna anonima se agrega donde se requiere una refrerencia 
        // dentro de un constructor a un metodo 
        
    }
    
}
