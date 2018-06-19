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
public class List extends Productos{

    public List(ArrayList Nombre) {
        super(Nombre);
    }

    @Override
    public void IngresarNombre(String nombres) {
         //To change body of generated methods, choose Tools | Templates.
         super.Nombre.add(nombres);
        
    }

    @Override
    public void EliminarNombre(String nombres) {
         //To change body of generated methods, choose Tools | Templates.
         super.Nombre.remove(super.Nombre.indexOf(nombres));
         
    }

    @Override
    public String BuscarNombre(String nombres) {
        
         String buscarProducto = "";
         if(super.Nombre.contains(nombres)==true){
             buscarProducto= super.Nombre.get(super.Nombre.indexOf(nombres)).toString();
         }else{
             buscarProducto = "No existe Producto!";
         }
         return buscarProducto;
    }

   
    
}
