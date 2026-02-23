package com.example.neoAPP.modelos;

import java.time.LocalDate;

public class Gasto {

    //id, descripcion, fecha, valor, imagen(icono)
    private int id;
    private String descripcion;
    private LocalDate fecha;
    private Double valor;
    private String imagen;

    public Gasto() {
    }

    public Gasto(int id, String descripcion, LocalDate fecha, Double valor, String imagen) {
        this.id = id;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.valor = valor;
        this.imagen = imagen;
    }

    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public Double getValor() {
        return valor;
    }

    public String getImagen() {
        return imagen;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    

}
