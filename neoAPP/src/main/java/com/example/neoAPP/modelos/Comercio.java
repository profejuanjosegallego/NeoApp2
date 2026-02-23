package com.example.neoAPP.modelos;

public class Comercio {

    //id,nit,nombre,actividad,contacto(correo)
    private int id;
    private String nit;
    private String nombre;
    private String actividad;
    private String contacto;

    public Comercio() {
    }

    public Comercio(int id, String nit, String nombre, String actividad, String contacto) {
        this.id = id;
        this.nit = nit;
        this.nombre = nombre;
        this.actividad = actividad;
        this.contacto = contacto;
    }

    public int getId() {
        return id;
    }

    public String getNit() {
        return nit;
    }

    public String getNombre() {
        return nombre;
    }

    public String getActividad() {
        return actividad;
    }

    public String getContacto() {
        return contacto;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    
    
    

}
