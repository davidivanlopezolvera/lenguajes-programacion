/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo11.collections;

import java.util.ArrayList;
import javax.swing.JRadioButton;

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
    
    Opcion o1p3=new Opcion("Jalisco",false); 
    Opcion o2p3=new Opcion("Ciudad de mexico",true);
    Opcion o3p3=new Opcion("Guadalajara",false);
    Opcion o4p3=new Opcion("Toluca",false);
    
    ArrayList<Opcion> opciones=new ArrayList<Opcion>();
    opciones.add(o1);
    opciones.add(o2);
    opciones.add(o3);
    opciones.add(o4);
    
    ArrayList<Opcion> opcionesp2=new ArrayList<Opcion>();
    opcionesp2.add(o1p2);
    opcionesp2.add(o2p2);
    opcionesp2.add(o3p2);
    opcionesp2.add(o4p2);
    
    ArrayList<Opcion> opcionesp3=new ArrayList<Opcion>();
    opcionesp3.add(o1p3);
    opcionesp3.add(o2p3);
    opcionesp3.add(o3p3);
    opcionesp3.add(o4p3);
            
      Pregunta p1=new Pregunta("Capital de Rusia", opciones);
      Pregunta p2=new Pregunta("Capital de china", opcionesp2);
      Pregunta p3=new Pregunta("Capital de Mexico", opcionesp3);
      
      ArrayList<Pregunta> preguntas=new ArrayList<Pregunta>();
      preguntas.add(p1);
      preguntas.add(p2);
      preguntas.add(p3);
      return preguntas;
      
    }
    
    public static boolean checarRespuesta(Pregunta p, JRadioButton[] radios){ 
        boolean respuesta=false; 
        String seleccion=""; 
        for(JRadioButton radio:radios){ 
            if(radio.isSelected()){ 
                seleccion= radio.getText(); 
            }
        }
        for(Opcion o:p.getOpciones()){
        if(o.isEstatus()){
            if(o.getTitulo().equals(seleccion))respuesta=true; 
        
    }
    }
    
    return respuesta; 
}
}
