package com.prueba.mp.project.models;

import javax.persistence.*;

// @Entity
// @Table(name = "departamento")
// public class DepartamentoModel {
//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     @Column(unique = true, nullable = false, name = "departamento_id")
//     private Long id;

//     private String descripcion;

//     public Long getid() {
//         return id;
//     }

//     public void setid(Long id) {
//         this.id = id;
//     }

//     public String getDescripcion() {
//         return descripcion;
//     }

//     public void setDescripcion(String descripcion) {
//         this.descripcion = descripcion;
//     }

// }

@Entity
@Table(name = "departamento")
public class DepartamentoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false, name = "departamento_id")
    private long id;
    private String descripcion;

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

}
