package com.itb.inf2dm.smartfishingd.model.entity;
import jakarta.persistence.*;
@Entity
@Table(name = "UsuarioPesqueiro")
public class UsuarioPesqueiro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "statusUsuarioPesqueiro")
    private Boolean statusUsuarioPesqueiro;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }



    public Boolean getStatusUsuarioPesqueiro() {
        return statusUsuarioPesqueiro;
    }

    public void setStatusUsuarioPesqueiro(Boolean statusUsuarioPesqueiro) {
        this.statusUsuarioPesqueiro = statusUsuarioPesqueiro;
    }
}
