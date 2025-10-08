package com.itb.inf2dm.smartfishingd.model.entity;
import jakarta.persistence.*;
@Entity
@Table(name = "Catalogo")

public class Catalogo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = true)
    private String idPeixe;
    @Column(nullable = true)
    private String idPesqueiro;
    private String statusCatalogo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIdPeixe() {
        return idPeixe;
    }

    public void setIdPeixe(String idPeixe) {
        this.idPeixe = idPeixe;
    }

    public String getIdPesqueiro() {
        return idPesqueiro;
    }

    public void setIdPesqueiro(String idPesqueiro) {
        this.idPesqueiro = idPesqueiro;
    }

    public String getStatusCatalogo() {
        return statusCatalogo;
    }

    public void setStatusCatalogo(String statusCatalogo) {
        this.statusCatalogo = statusCatalogo;
    }
}
