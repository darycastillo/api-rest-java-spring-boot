package com.prueba.mp.project.models;

import javax.persistence.*;

@Entity
@Table(name = "fiscalia")
public class FiscaliaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false, name = "fiscalia_id")
    private Long id;

    private Integer departamento;
    private String descripcion;
    private String direccion;
    private Integer estado;
    private Integer municipio;
    private String nombre;

    public Long getid() {
        return id;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getMunicipio() {
        return municipio;
    }

    public Integer getDepartamento() {
        return departamento;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setid(Long id) {
        this.id = id;
    }

    public void setMunicipio(Integer municipio) {
        this.municipio = municipio;
    }

    public void setDepartamento(Integer departamento) {
        this.departamento = departamento;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}