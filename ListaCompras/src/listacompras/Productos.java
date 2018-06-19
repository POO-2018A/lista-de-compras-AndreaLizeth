/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listacompras;

import java.util.ArrayList;

/**
 *
 * @author Andrea Lizeth
 */
public abstract class Productos {
     ArrayList Nombre;

    public Productos(ArrayList Nombre) {
        this.Nombre = Nombre;
    }

    public ArrayList getNombre() {
        return Nombre;
    }

    public void setNombre(ArrayList Nombre) {
        this.Nombre = Nombre;
    }
    
    
    public abstract void IngresarNombre(String nombres);
    public abstract void EliminarNombre(String nombres);
    public abstract String BuscarNombre(String nombres);
  
    
    
    
}
