/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo5.excepciones;

/**
 *
 * @author T-101
 */
public class ClaseMuyUtil {
    public static void main(String[] args) {
        String hola="d_ivan_l@hotmail.com";
       if( hola.contains("@")){
           System.out.println("sicontiene una arroba");
       }else{
           System.out.println("no contiene la arroba");
       }
    }
    
}