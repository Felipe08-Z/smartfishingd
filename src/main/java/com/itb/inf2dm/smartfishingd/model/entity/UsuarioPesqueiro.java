package com.itb.inf2dm.smartfishingd.model.entity;

public class UsuarioPesqueiro {
    private Long id;
    private String idUsuario;
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
