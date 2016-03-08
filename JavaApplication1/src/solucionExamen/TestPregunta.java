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
public class TestPregunta {
    
    public static void main(String[] args)throws Exception{
        opcion op1=new opcion("paris",false);
        opcion op2=new opcion("florencia",false);
        opcion op3=new opcion("londres",false);
        opcion op4=new opcion("moscu",true);
        opcion opciones[]=new opcion [4]; 
   
        opciones[0]=op1;
        opciones[1]=op2;
        opciones[2]=op3;
        opciones[3]=op4;
        
        ValidarOpcion validar= new ValidarOpcion(); 
        validar.validar(opciones);
        pregunta p=new pregunta("capital de rusia",opciones); 
         
        
        
    }
}
