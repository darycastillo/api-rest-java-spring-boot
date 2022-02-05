package com.prueba.mp.project.models;

import java.util.Optional;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

// @Entity
// @Table(name = "municipio")
// public class MunicipioModel {
//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     @Column(unique = true, nullable = false, name = "municipio_id")
//     private Long id;

//     private String descripcion;

//     @ManyToOne(fetch = FetchType.LAZY, optional = false)
//     @JoinColumn(name = "departamento_id", nullable = false)
//     @OnDelete(action = OnDeleteAction.CASCADE)
//     @JsonIgnore
//     private DepartamentoModel departamento;

//     public String getDescripcion() {
//         return descripcion;
//     }

//     public void setDescripcion(String descripcion) {
//         this.descripcion = descripcion;
//     }

//     public DepartamentoModel getDepartamento() {
//         return departamento;
//     }

//     public void setDepartamento(DepartamentoModel departamento) {
//         this.departamento = departamento;
//     }
// }

@Entity
@Table(name = "municipio")
public class MunicipioModel {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "municipio_generator")
    private Long id;

    private String descripcion;

    // @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "departamento_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private DepartamentoModel departamento;

    public Long getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public DepartamentoModel getDepartamento() {
        return departamento;
    }

    public void setDepartamento(DepartamentoModel departamento) {
        this.departamento = departamento;
    }

}
