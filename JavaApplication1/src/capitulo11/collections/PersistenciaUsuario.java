/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo11.collections;
import java.io.*; 
import java.util.ArrayList;
public class PersistenciaUsuario {
    ArrayList<Usuario>Usuarios;
    
    public PersistenciaUsuario {
    Usuarios=new 
}
    //primero ponemos el metodo de buscar todos 
    ArrayList<Usuario> buscarTodos()throws Exception{ 
    //paso numero 1:leemos el archivo donde esta guardado el arraylist 
        File f=new File("archivaldo.raton"); 
        //leemos el contenido 
        FileInputStream fis=new FileInputStream(f); 
        //Descomprimimos el contenido 
        ObjectInputStream ois=new ObjectInputStream(fis); 
       Usuarios=(ArrayList<Usuario>) ois.readObject(); 
    return Usuarios; 
    }
    
    public void guardar(Usuario u)throws Exception{
        File f=new File("arcivaldo.raton"); 
        if(f.exists())usuario=buscarTodos();
    }
 
    
}
