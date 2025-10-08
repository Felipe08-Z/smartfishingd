package com.itb.inf2dm.smartfishingd.model.entity;
import jakarta.persistence.*;
@Entity
@Table(name = "Peixe")

public class Peixe {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 100, nullable = false)
    private String nome;
    @Column(length = 250, nullable = false)
    private String descricao;
    @Column(length = 100, nullable = true)
    private String foto;
    private String statusPeixe;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getStatusPeixe() {
        return statusPeixe;
    }

    public void setStatusPeixe(String statusPeixe) {
        this.statusPeixe = statusPeixe;
    }
}
