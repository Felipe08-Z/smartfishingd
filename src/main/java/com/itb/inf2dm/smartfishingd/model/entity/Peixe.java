package com.itb.inf2dm.smartfishingd.model.entity;
import jakarta.persistence.*;
@Entity
@Table(name = "Peixe")

public class Peixe {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 50, nullable = false)
    private String nome;
    @Column(length = 200, nullable = false)
    private String descricao;
    @Column(length = 15, nullable = true)
    private String foto;
    @Column(name = "statusPeixe")
    private Boolean statusPeixe;

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

    public Boolean getStatusPeixe() {
        return statusPeixe;
    }

    public void setStatusPeixe(Boolean statusPeixe) {
        this.statusPeixe = statusPeixe;
    }
}
