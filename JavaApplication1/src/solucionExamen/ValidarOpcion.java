/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solucionExamen;

/**
 *
 * @author T-101
 */
public class ValidarOpcion {
    
    public void  validar (opcion[] opciones)throws soloUnaCorrectaException{
    int soloUna=0;
    for(opcion o:opciones){
    if(o.isStatus()){  
        soloUna++; 
        if(soloUna>1)throw new soloUnaCorrectaException();
    }
}
    
}
}
