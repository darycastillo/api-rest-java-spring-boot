package com.prueba.mp.project.models;

import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "departamento")
public class DepartamentoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false, name = "departamento_id")
    private long id;
    private String descripcion;

    @OneToMany(mappedBy = "departamento")
    private Set<MunicipioModel> municipios;

    public Long getid() {
        return id;
    }

    public void setid(Long id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setMunicipios(Set<MunicipioModel> municipios) {
        this.municipios = municipios;
    }

    public Set<MunicipioModel> getMunicipios() {
        return municipios;
    }
}
