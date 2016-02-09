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
public class Cliente {
    private String email;
    private int edad;
    

    /**
     * Este metodo nos regresa el email que ya previamente se debio 
     * haber proporcionado por el metodo set correspondiente 
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    public Cliente(String email, int edad) {
        this.email = email;
        this.edad = edad;
    }

    public Cliente() {
    }
    

    /**
     * Este metodo necesita que proporciones un string 
     * que le va a ser el email que le va a asignar al cliente 
     * @param email  aqui debes poner el string correspondiente al email 
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) throws ValorNoNegativoException {
        ValidarEdad validar=new ValidarEdad();
        validar.checarEdadNegativa(edad);
        this.edad = edad;
    }
    
    
}
