package com.itb.inf2dm.smartfishingd.controller;

import com.itb.inf2dm.smartfishingd.model.entity.Catalogo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.ArrayList;

@RestController
@RequestMapping("/api/v1/catalogo")
public class ControllerCatalogo {

    List<Catalogo> catalogos = new ArrayList<Catalogo>();

    @GetMapping
    public List<Catalogo> findall() {

        Catalogo c1 = new Catalogo();
        c1.setIdPeixe("");
        c1.setIdPesqueiro("");
        c1.setStatusCatalogo("");

        catalogos.add(c1);
        return catalogos;

    }


}
