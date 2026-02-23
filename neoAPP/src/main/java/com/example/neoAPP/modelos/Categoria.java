package com.example.neoAPP.modelos;

import java.time.LocalDate;

public class Categoria {

    //id, nombre, fechaCreacion, responsable, justificacion
    private int id;
    private String nombre;
    private LocalDate fechaCreacion;
    private String responsable;
    private String justificacion;

    public Categoria() {
    }

    public Categoria(int id, String nombre, LocalDate fechaCreacion, String responsable, String justificacion) {
        this.id = id;
        this.nombre = nombre;
        this.fechaCreacion = fechaCreacion;
        this.responsable = responsable;
        this.justificacion = justificacion;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public String getResponsable() {
        return responsable;
    }

    public String getJustificacion() {
        return justificacion;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public void setJustificacion(String justificacion) {
        this.justificacion = justificacion;
    }

    

    

}
