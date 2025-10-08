package com.itb.inf2dm.smartfishingd.model.entity;
import jakarta.persistence.*;
@Entity
@Table(name = "Pesqueiro")
public class Pesqueiro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 100, nullable = false)
    private String nome;
    @Column(length = 15, nullable = false)
    private String telefone;
    @Column(length = 250, nullable = false)
    private String descricao;
    @Column(length = 200, nullable = false)
    private String informacao;
    @Column(length = 10, nullable = true)
    private String foto;
    @Column(length = 500, nullable = true)
    private String mapa;
    @Column(length = 100, nullable = true)
    private String cep;
    @Column(length = 45, nullable = true)
    private String numero;
    @Column(length = 15, nullable = true)
    private String complemento;
    @Column(length = 100, nullable = true)
    private String dataCadastro;
    private String statusPesqueiro;

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

    public String getInformacao() {
        return informacao;
    }

    public void setInformacao(String informacao) {
        this.informacao = informacao;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getMapa() {
        return mapa;
    }

    public void setMapa(String mapa) {
        this.mapa = mapa;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }



    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }


    public String getStatusPesqueiro() {
        return statusPesqueiro;
    }

    public void setStatusPesqueiro(String statusPesqueiro) {
        this.statusPesqueiro = statusPesqueiro;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
}
