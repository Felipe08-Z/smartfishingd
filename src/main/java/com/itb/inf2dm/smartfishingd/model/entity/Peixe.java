package com.itb.inf2dm.smartfishingd.model.entity;

public class Peixe {

    private Long id;
    private String nome;
    private String descricao;
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
