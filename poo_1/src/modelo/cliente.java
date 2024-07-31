/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author SJimenez
 */
public class cliente extends persona{
    private String nit;  

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
}
    // interaccion 
    
    @Override
    public void agregar() {
    System.out.println("nit"+getNit ());
    System.out.println("Nombres"+getNit ());
    System.out.println("Direccion:"+getDireccion ());
    System.out.println("telefono"+getTelefono ());
    System.out.println("Fecha Nacimiento"+getFecha_nacimiento());
    }
     
}
