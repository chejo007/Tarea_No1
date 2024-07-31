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
  public cliente(String text, String text1, String text2, String text3, String text4){}

    public cliente(String nit, String nombres, String apellis, String direccion, String telefono, String fecha_nacimeinto) {
        super(nombres, apellis, direccion, telefono, fecha_nacimeinto);
        this.nit = nit;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }
  @Override
  public void agragar(){
   System.out.println("nit:"+getNit ());
    System.out.println("Nombres:"+getNit ());
    System.out.println("Direccion:"+getDireccion ());
    System.out.println("telefono:"+getTelefono ());
  } 

    public void agregar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
