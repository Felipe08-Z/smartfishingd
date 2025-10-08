package com.itb.inf2dm.smartfishingd.model.entity;
import jakarta.persistence.*;
@Entity
@Table(name = "Catalogo")
public class UsuarioPesqueiro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = true)
    private String idUsuario;
    @Column(nullable = true)
    private String idPesqueiro;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getIdPesqueiro() {
        return idPesqueiro;
    }

    public void setIdPesqueiro(String idPesqueiro) {
        this.idPesqueiro = idPesqueiro;
    }
}
