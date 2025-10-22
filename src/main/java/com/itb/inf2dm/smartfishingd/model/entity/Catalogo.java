package com.itb.inf2dm.smartfishingd.model.entity;
import jakarta.persistence.*;
@Entity
@Table(name = "Catalogo")

public class Catalogo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "statusCatalogo")
    private Boolean statusCatalogo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public Boolean getStatusCatalogo() {
        return statusCatalogo;
    }

    public void setStatusCatalogo(Boolean statusCatalogo) {
        this.statusCatalogo = statusCatalogo;
    }
}
