package com.itb.inf2dm.smartfishingd.controller;

import com.itb.inf2dm.smartfishingd.model.entity.Pesqueiro;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/pesqueiro")
public class ControllerPesqueiro {

    List<Pesqueiro> pesqueiros = new ArrayList<Pesqueiro>();

    @GetMapping
    public List<Pesqueiro> findall() {

    Pesqueiro pq1 = new Pesqueiro();
        pq1.setNome("");
        pq1.setTelefone("");
        pq1.setDescricao("");
        pq1.setInformacao("");
        pq1.setFoto("");
        pq1.setMapa("");
        pq1.setCep("");
        pq1.setNumero("");
        pq1.setComplemento("");
        pq1.setDataCadastro("");
        pq1.setStatusPesqueiro("");

        pesqueiros.add(pq1);
        return pesqueiros;
    }

}
