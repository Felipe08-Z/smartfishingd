package com.itb.inf2dm.smartfishingd.model.entity;

public class Catalogo {
    private Long id;
    private String idPeixe;
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
