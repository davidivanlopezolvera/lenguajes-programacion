/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo11.collections;

import java.util.ArrayList;

/**
 *
 * @author T-101
 */
public class GeneradorPreguntas {
    
    public static ArrayList<Pregunta>obtenerTodasLasPreguntas(){
    //Vamos a craer una sola pregunta con tres opciones
    Opcion o1=new Opcion("Moscu", true);
    Opcion o2=new Opcion("Florencia",false);
    Opcion o3=new Opcion("Paris",false);
    Opcion o4=new Opcion("Londres",false);
    
    Opcion o1p2=new Opcion("Tokio",false); 
    Opcion o2p2=new Opcion("Beijing",true);
    Opcion o3p2=new Opcion("Seul",false);
    Opcion o4p2=new Opcion("pyongyang",false);
    
    ArrayList<Opcion> opciones=new ArrayList<Opcion>();
    opciones.add(o1p2);
    opciones.add(o2p2);
    opciones.add(o3p2);
    opciones.add(o4p2);
    
    ArrayList<Opcion> opcionesp2=new ArrayList<Opcion>();
    opciones.add(o1);
    opciones.add(o2);
    opciones.add(o3);
    opciones.add(o4);
    
      Pregunta p1=new Pregunta("Capital de Rusia", opciones);
      Pregunta p2=new Pregunta("Capital de china", opcionesp2);
      
      ArrayList<Pregunta> preguntas=new ArrayList<Pregunta>();
      preguntas.add(p1);
      preguntas.add(p2);
      return preguntas;
      
    }
    
}
