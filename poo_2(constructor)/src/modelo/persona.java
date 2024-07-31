/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author SJimenez
 */
abstract class persona {
private String nombres,apellis,direccion,telefono,fecha_nacimeinto;
// el contructor itene que tener emismo nombre de la class con cantidades distintas de parametros
public persona(){}
    public persona(String nombres, String apellis, String direccion, String telefono, String fecha_nacimeinto) {
        this.nombres = nombres;
        this.apellis = apellis;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fecha_nacimeinto = fecha_nacimeinto;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellis() {
        return apellis;
    }

    public void setApellis(String apellis) {
        this.apellis = apellis;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFecha_nacimeinto() {
        return fecha_nacimeinto;
    }

    public void setFecha_nacimeinto(String fecha_nacimeinto) {
        this.fecha_nacimeinto = fecha_nacimeinto;
    }
// poliformismo
    protected void agragar (){}
    
}
