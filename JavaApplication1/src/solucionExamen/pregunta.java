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
public class pregunta {
    
    String titulo; 
    opcion opciones[];

    public pregunta(String titulo, opcion[] opciones) {
        this.titulo = titulo;
        this.opciones = opciones;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public opcion[] getOpciones() {
        return opciones;
    }

    public void setOpciones(opcion[] opciones) {
        this.opciones = opciones;
    }
    
    
}
