package com.example.neoAPP.modelos;

import org.hibernate.annotations.IdGeneratorType;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuarios")

public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //id,nombres,tipodocumento,documento,edad
    private int id;
    private String nombres;
    private String tipodocumento;
    private String documento;
    private int edad;

    public Usuario() {
    }

    public Usuario(int id, String nombres, String tipodocumento, String documento, int edad) {
        this.id = id;
        this.nombres = nombres;
        this.tipodocumento = tipodocumento;
        this.documento = documento;
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public String getNombres() {
        return nombres;
    }

    public String getTipodocumento() {
        return tipodocumento;
    }

    public String getDocumento() {
        return documento;
    }

    public int getEdad() {
        return edad;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setTipodocumento(String tipodocumento) {
        this.tipodocumento = tipodocumento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


}
